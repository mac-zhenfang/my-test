/**
 * 
 */
package hadoop.mr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
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
import org.apache.hadoop.util.LineReader;

/**
 * @author root
 * 
 */
public class SkipReadLineInputFormat extends
		FileInputFormat<LongWritable, Text> {

	private static final Log LOG = LogFactory
			.getLog(SkipReadLineInputFormat.class);

	private static String READ_LINE_PER_MAP = "mapreduce.input.skippableinputformat.linespermap";

	private static String FILE_OFFSET_CACHE = "mapreduce.input.skippableinputformat.cacheaddr";
	
	private static String CONFIG_LZO_COMPRESS = "mapreduce.input.skippableinputformat.lzocompress";
	
	private static long LINE_PER_MAP = 100;

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
		context.setStatus(genericSplit.toString());
		boolean isLZOCompress = context.getConfiguration().getBoolean(
				CONFIG_LZO_COMPRESS, false);
		context.setStatus(genericSplit.toString());
		if (isLZOCompress) {
			return new CompressedLineReader();
		} else {
			return new LineRecordReader();
		}
	}

	public List<InputSplit> getSplits(JobContext job) throws IOException {
		// TODO need test
		long start = System.currentTimeMillis();
		List<InputSplit> splits = new ArrayList<InputSplit>();
		long numberLine = getNumberLinePerSplit(job);

		MapFile.Reader cacheReader = getCacheReader(job);

		MapFile.Writer cacheWriter = getCacheWriter(job);

		Text key = new Text();
		LongWritable offsetLong = new LongWritable();
		for (FileStatus status : listStatus(job)) {
			long startOffset = getStatOffset(cacheReader, status);
			LOG.info(" start key " + status.getPath().getName() + " offset: "
					+ startOffset);
			OffsetSplitsPair pair = getSplitsForFile(status, job, numberLine,
					startOffset);
			List<FileSplit> fileSplits = pair.getSplits();
			splits.addAll(fileSplits);
			long offset = pair.getOffset();

			key.set(status.getPath().getName().getBytes());
			offsetLong.set(offset);
			cacheWriter.append(key, offsetLong);
			key.clear();
		}
		if (null != cacheReader)
			cacheReader.close();
		if (null != cacheWriter)
			cacheWriter.close();
		// If the numberPerSplits >>>> the filesize, then use the super to
		// define every block.
		// It it is indeed no splits, the super will return NULL.
		if (splits.isEmpty()) {
			return super.getSplits(job);
		}
		long end = System.currentTimeMillis();
		LOG.info(" getSplits cost " + (end - start));
		return splits;
	}

	public static OffsetSplitsPair getSplitsForFile(FileStatus status,
			JobContext job, long numLinesPerSplit, long startOffset)
			throws IOException {
		long start = System.currentTimeMillis();
		Configuration conf = job.getConfiguration();

		OffsetSplitsPair splitPair = new OffsetSplitsPair();

		Path fileName = status.getPath();
		if (status.isDirectory()) {
			throw new IOException("Not a file: " + fileName);
		}
		FileSystem fs = fileName.getFileSystem(conf);
		FSDataInputStream in = fs.open(fileName);
		in.seek(startOffset); // FIXME issue of broken line?
		LineReader lr = new LineReader(in, conf);
		Text line = new Text();
		int numLines = 0;
		long length = 0;
		int num = -1;
		while ((num = lr.readLine(line)) > 0) {
			numLines++;
			length += num;
			if (numLines == numLinesPerSplit) {
				// since it uses LineRecordReader, which always reads
				// (and consumes) at least one character out of its upper split
				// boundary. So to make sure that each mapper gets N lines, we
				// move back the upper split limits of each split
				// FIXME it may change since we might use the LZO Compression
				// reader.
				// by one character here.
				if (startOffset == 0) {
					splitPair.addSplit(new FileSplit(fileName, startOffset,
							length - 1, new String[] {}));
				} else {
					splitPair.addSplit(new FileSplit(fileName, startOffset - 1,
							length, new String[] {}));
				}
				splitPair.setOffset(length);
				break;
			}
		}
		long end = System.currentTimeMillis();
		LOG.info(" getForSplit cost " + (end - start));

		return splitPair;
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
		String cacheFileAddr = conf.get(FILE_OFFSET_CACHE);
		if (null == cacheFileAddr) {

			throw new IOException("the " + FILE_OFFSET_CACHE
					+ " has NOT been set");
		}
		return cacheFileAddr;
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

	private long getNumberLinePerSplit(JobContext job) {
		return job.getConfiguration().getLong(READ_LINE_PER_MAP, LINE_PER_MAP);
	}

	private long getStatOffset(MapFile.Reader cacheReader, FileStatus file)
			throws IOException {
		// get the key-value
		if (null == cacheReader) {
			return 0L;
		}
		Text fileNameKey = new Text(file.getPath().getName());
		LongWritable offset = new LongWritable();
		cacheReader.get(fileNameKey, offset);
		return offset.get();
	}
}

class OffsetSplitsPair {

	List<FileSplit> splits = new ArrayList<FileSplit>();

	long offset;

	/**
	 * @return the status
	 */
	public List<FileSplit> getSplits() {
		return splits;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void addSplit(FileSplit split) {
		this.splits.add(split);
	}

	/**
	 * @return the offset
	 */
	public long getOffset() {
		return offset;
	}

	/**
	 * @param offset
	 *            the offset to set
	 */
	public void setOffset(long offset) {
		this.offset = offset;
	}

}
