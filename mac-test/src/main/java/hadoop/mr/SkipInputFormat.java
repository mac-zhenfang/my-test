/**
 *  Need to do: LZO/too see if we NOT use readline.
 */
package hadoop.mr;

import static org.apache.hadoop.mapreduce.lib.input.FileInputFormat.NUM_INPUT_FILES;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.BlockLocation;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.MapFile;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.JobContext;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;
import org.apache.hadoop.mapreduce.lib.input.LineRecordReader;

/**
 * 1. Get the start-line from DistributeCache 2. Get the read-line from
 * configuration 3. Generate the splits from the start-line -> read-line +
 * start-line
 * 
 * @date 2011-7-21
 * @since: mac-test
 * @author mac
 */
public class SkipInputFormat extends FileInputFormat<LongWritable, Text> {

	private static final Log LOG = LogFactory.getLog(SkipInputFormat.class);

	private static String CONFIG_READ_TAIL_SIZE = "mapreduce.input.skippableinputformat.tailsize";

	private static String CONFIG_FILE_OFFSET_CACHE = "mapreduce.input.skippableinputformat.cacheaddr";

	private static String CONFIG_LZO_COMPRESS = "mapreduce.input.skippableinputformat.lzocompress";

	private static long DEFAULT_TAIL_SIZE = 512 * 1024; // Byte

	private final Map<Path, LzoIndex> indexes = new HashMap<Path, LzoIndex>();

	private final Map<Path, Long> fileSizeMap = new HashMap<Path, Long>();

	private static final double SPLIT_SLOP = 1.1; // 10% slop

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.hadoop.mapreduce.InputFormat#createRecordReader(org.apache
	 * .hadoop.mapreduce.InputSplit,
	 * org.apache.hadoop.mapreduce.TaskAttemptContext)
	 */
	@Override
	public RecordReader<LongWritable, Text> createRecordReader(
			InputSplit genericSplit, TaskAttemptContext context)
			throws IOException, InterruptedException {
		boolean isLZOCompress = context.getConfiguration().getBoolean(
				CONFIG_LZO_COMPRESS, false);
		context.setStatus(genericSplit.toString());
		if (isLZOCompress) {
			return new CompressedLineReader();
		} else {
			return new LineRecordReader();
		}
	}

	/**
	 * The override is to add the lzo index prepared once the first time iterate
	 * the files.
	 * */
	@Override
	protected List<FileStatus> listStatus(JobContext job) throws IOException {
		List<FileStatus> files = super.listStatus(job);
		List<FileStatus> filesWithoutIndex = new ArrayList<FileStatus>();
		Configuration conf = job.getConfiguration();
		String fileExtension = new LzoCodec().getDefaultExtension(); // FIXME
																		// should
																		// be
																		// lzod
		for (FileStatus fileStatus : files) {

			Path file = fileStatus.getPath();
			fileSizeMap.put(fileStatus.getPath(), fileStatus.getLen());
			FileSystem fs = file.getFileSystem(conf);
			if (file.toString().endsWith(fileExtension)) {
				LzoIndex index = LzoIndex.readIndex(fs, file);
				indexes.put(file, index);
			}

			if (!file.toString().endsWith(LzoIndex.LZO_INDEX_SUFFIX)) {
				filesWithoutIndex.add(fileStatus);
			}
		}
		return filesWithoutIndex;

	}

	/**
	 * 
	 * */
	public List<InputSplit> getSplits(JobContext job) throws IOException {

		long start = System.currentTimeMillis();

		long tailSize = getTailSize(job);

		// List<InputSplit> filesSplits = super.getSplits(job);

		// it is better to put it here, since we have cache
		Map<String, Long> startOffsetMap = initStartOffSets(job);
		// use the super.getSplits logic to do split
		Map<Path, List<InputSplit>> splitsPerFileMap = initSplitsPerFile(job);

		// the write to the MapFile must be sequential.

		Map<String, Long> writeToCacheMap = new TreeMap<String, Long>();

		List<InputSplit> splits = getSplitsForSkipSize(job, splitsPerFileMap,
				startOffsetMap, tailSize, writeToCacheMap);
		LOG.info(" after getSplitsForSkipSize: " + splits);
		List<InputSplit> splitsAfterLzo = getSplitsForLZO(job, splits);
		LOG.info(" after getSplitsForLZO: " + splitsAfterLzo);
		List<InputSplit> splitsAfterCombine = getSplitsForCombine(job,
				splitsAfterLzo);
		// write it into cache file
		writeToCacheFile(job, writeToCacheMap);

		LOG.info(" ToDo List " + splitsAfterCombine);

		// make sure if there is no splits, use the former splits
		if (splitsAfterCombine.isEmpty()) {
			if (!splitsAfterLzo.isEmpty())
				return splitsAfterLzo;
			if (!splits.isEmpty())
				return splits;
			return super.getSplits(job);
		}

		long end = System.currentTimeMillis();

		LOG.info(" getSplits cost " + (end - start));
		return splitsAfterCombine;
	}

	/** TODO combine splits per node */
	private List<InputSplit> getSplitsForCombine(JobContext job,
			List<InputSplit> splits) throws IOException {

		return splits;
	}

	/**
	 * if the file is LZO, we have to modify the startoffset, endoffset
	 * according to the index
	 * */
	private List<InputSplit> getSplitsForLZO(JobContext job,
			List<InputSplit> splits) throws IOException {
		Configuration conf = job.getConfiguration();
		// find new start/ends of the filesplit that aligns
		// with the lzo blocks

		List<InputSplit> result = new ArrayList<InputSplit>();

		for (InputSplit genericSplit : splits) {
			// load the index
			FileSplit fileSplit = (FileSplit) genericSplit;
			Path file = fileSplit.getPath();
			FileSystem fs = file.getFileSystem(conf);
			LzoIndex index = indexes.get(file);

			if (null == index || index.isEmpty()) {
				LOG.info(" the file " + file + " doesn't have index file");
				result.add(fileSplit);
				continue;
			}

			long start = fileSplit.getStart();
			long end = start + fileSplit.getLength();

			long lzoStart = index.alignSliceStartToIndex(start, end);
			long lzoEnd = index.alignSliceEndToIndex(end, fs
					.getFileStatus(file).getLen());

			if (lzoStart != LzoIndex.NOT_FOUND && lzoEnd != LzoIndex.NOT_FOUND) {
				result.add(new FileSplit(file, lzoStart, lzoEnd - lzoStart,
						fileSplit.getLocations()));
			}
		}

		return result;
	}

	/**
	 * According to the splits which has been determined by the split size and
	 * block size and use the tail size and the startoffset to return a new
	 * split list.
	 * */
	private List<InputSplit> getSplitsForSkipSize(JobContext job,
			Map<Path, List<InputSplit>> splitsPerFileMap,
			Map<String, Long> startOffsetMap, long tailSize,
			Map<String, Long> writeToCacheMap) throws IOException {
		List<InputSplit> splits = new ArrayList<InputSplit>();
		Iterator<Path> iter = splitsPerFileMap.keySet().iterator();

		while (iter.hasNext()) {
			Path fileNameKey = iter.next();
			long startOffset = startOffsetMap.get(fileNameKey.getName());

			LOG.info(" start offset of file: " + fileNameKey + " is "
					+ startOffset);

			long fileSize = fileSizeMap.get(fileNameKey);

			if (startOffset < fileSize) {
				List<InputSplit> splitsFile = splitsPerFileMap.get(fileNameKey);

				long bytesRemaining = Math.min(tailSize, fileSize);

				if (bytesRemaining > fileSize) {
					LOG.info(" the tail size " + bytesRemaining
							+ " > the fileSize, we will use file size "
							+ fileSize + " to do mr");
				}
				LOG.info(" before getSplitsForSkipSize: " + splitsFile);
				for (InputSplit split : splitsFile) {
					if (bytesRemaining <= 0 || startOffset > fileSize) {
						break;
					}
					FileSplit genericSplit = (FileSplit) split;
					long readSize = Math.min(bytesRemaining,
							genericSplit.getLength());
					FileSplit newSplit = new FileSplit(fileNameKey,
							startOffset, readSize, genericSplit.getLocations());
					splits.add(newSplit);
					bytesRemaining -= readSize;
					startOffset += readSize;
				}

				// record it in the map cache
				writeToCacheMap.put(fileNameKey.getName(), startOffset);
			}
		}

		return splits;
	}

	/**
	 * clean the splits and constructure them into a Map with the Key: file
	 * path, value: list of FileInputs
	 * */
	private Map<Path, List<InputSplit>> initSplitsPerFile(JobContext job)
			throws IOException {
		long minSize = Math.max(getFormatMinSplitSize(), getMinSplitSize(job));
		long maxSize = getMaxSplitSize(job);
		// LOG.info(" original splits size: " + filesSplits.size());

		// put the splits for each file
		Map<Path, List<InputSplit>> splitsPerFileMap = new HashMap<Path, List<InputSplit>>();

		List<FileStatus> files = listStatus(job);
		for (FileStatus file : files) {
			List<InputSplit> splits = new ArrayList<InputSplit>();
			Path path = file.getPath();
			long length = file.getLen();
			if (length != 0) {
				FileSystem fs = path.getFileSystem(job.getConfiguration());
				BlockLocation[] blkLocations = fs.getFileBlockLocations(file,
						0, length);
				if (isSplitable(job, path)) {
					long blockSize = file.getBlockSize();
					long splitSize = computeSplitSize(blockSize, minSize,
							maxSize);

					long bytesRemaining = length;
					while (((double) bytesRemaining) / splitSize > SPLIT_SLOP) {
						int blkIndex = getBlockIndex(blkLocations, length
								- bytesRemaining);
						splits.add(makeSplit(path, length - bytesRemaining,
								splitSize, blkLocations[blkIndex].getHosts()));
						bytesRemaining -= splitSize;
					}

					if (bytesRemaining != 0) {
						splits.add(makeSplit(path, length - bytesRemaining,
								bytesRemaining,
								blkLocations[blkLocations.length - 1]
										.getHosts()));
					}
				} else { // not splitable
					splits.add(makeSplit(path, 0, length,
							blkLocations[0].getHosts()));
				}
			} else {
				// Create empty hosts array for zero length files
				splits.add(makeSplit(path, 0, length, new String[0]));
			}
			LOG.debug("Total # of splits: " + splits.size());
			splitsPerFileMap.put(path, splits);
		}
		// Save the number of input files for metrics/loadgen
		job.getConfiguration().setLong(NUM_INPUT_FILES, files.size());
		return splitsPerFileMap;
	}

	private void writeToCacheFile(JobContext job,
			Map<String, Long> writeToCacheMap) throws IOException {
		MapFile.Writer writer = getCacheWriter(job);
		Iterator<String> iter = writeToCacheMap.keySet().iterator();
		Text key = new Text();
		LongWritable offsetLong = new LongWritable();
		try {

			while (iter.hasNext()) {
				String k = iter.next();
				long offset = writeToCacheMap.get(k);
				key.set(k);
				offsetLong.set(offset);
				writer.append(key, offsetLong);
				key.clear();
			}
		} finally {
			key.clear();
			offsetLong.set(0L);
			writer.close();
		}
	}

	private MapFile.Writer getCacheWriter(JobContext job) throws IOException {
		String cacheFileAddr = getCacheAddr(job);
		MapFile.Writer cacheMapFileWriter = new MapFile.Writer(
				job.getConfiguration(), FileSystem.get(job.getConfiguration()),
				cacheFileAddr, Text.class, LongWritable.class);
		return cacheMapFileWriter;
	}

	private String getCacheAddr(JobContext job) throws IOException {
		Configuration conf = job.getConfiguration();
		String cacheFileAddr = conf.get(CONFIG_FILE_OFFSET_CACHE);
		if (null == cacheFileAddr) {

			throw new IOException("the " + CONFIG_FILE_OFFSET_CACHE
					+ " has NOT been set");
		}
		return cacheFileAddr;
	}

	/**
	 * Read the cache folder and init the cache of all mapreduce files
	 * 
	 * @throws IOException
	 * */
	private Map<String, Long> initStartOffSets(JobContext job)
			throws IOException {
		MapFile.Reader cacheReader = getCacheReader(job);
		Map<String, Long> startOffsetMap = new HashMap<String, Long>();
		try {
			// init the read start offset, FIXME
			if (fileSizeMap.size() > 0) {
				Iterator<Path> files = fileSizeMap.keySet().iterator();
				while (files.hasNext()) {
					Path file = files.next();
					long offset = getStatOffset(cacheReader, file);
					startOffsetMap.put(file.getName(), offset);
				}
			} else {
				for (FileStatus status : listStatus(job)) {
					if (!startOffsetMap.containsKey(status.getPath().getName())) {
						long offset = getStatOffset(cacheReader,
								status.getPath());
						startOffsetMap.put(status.getPath().getName(), offset);
					}
				}
			}

			return startOffsetMap;
		} finally {
			if (null != cacheReader)
				cacheReader.close();
		}
	}

	private MapFile.Reader getCacheReader(JobContext job) throws IOException {
		try {
			String cacheFileAddr = getCacheAddr(job);
			MapFile.Reader reader = new MapFile.Reader(FileSystem.get(job
					.getConfiguration()), cacheFileAddr, job.getConfiguration());
			return reader;
		} catch (Exception e) {
			// if it is NULL, it means the first time init the
			return null;
		}

	}

	private long getTailSize(JobContext job) {
		return job.getConfiguration().getLong(CONFIG_READ_TAIL_SIZE,
				DEFAULT_TAIL_SIZE);
	}

	private long getStatOffset(MapFile.Reader cacheReader, Path file)
			throws IOException {
		// get the key-value
		if (null == cacheReader) {
			return 0L;
		}
		Text fileNameKey = new Text(file.getName());
		LongWritable offset = new LongWritable();
		cacheReader.get(fileNameKey, offset);
		return offset.get();
	}
}
