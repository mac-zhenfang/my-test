/**
 * 
 */
package hadoop.lzo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.compress.BlockDecompressorStream;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * @author root
 * 
 */
public class LZOLocalWriter {

	public static class TestMapper extends Mapper<Object, Text, Text, Text> {
		@Override
		protected void setup(Context context) throws IOException,
				InterruptedException {

		}

		@Override
		public void map(Object key, Text value, Context context)
				throws IOException, InterruptedException {
			//System.out.println(" map: " + value.toString());
		}
	}

	public static class TestReducer extends Reducer<Text, Text, Text, Text> {

		@Override
		protected void setup(Context context) throws IOException,
				InterruptedException {

		}

		public void reduce(Text sessionIdText, Iterable<Text> values,
				Context context) throws IOException, InterruptedException {

		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// testLzop();
		// testLzopIndex();
		// testLZO_Block();
		// testLzoIndex();
		testMapReduce();
	}

	public static void testLZO_Block() throws Exception {
		// TODO Auto-generated method stub
		int lzoBufferSize = 256 * 1024;
		// File pdfFile = new File("/home/mac", "nfscookbook.pdf");
		// File lzoOutFile = new File("/home/mac", "rink-4.lzo_deflate");
		// if (lzoOutFile.exists()) {
		// lzoOutFile.delete();
		// }
		// BufferedReader textBr = new BufferedReader(new InputStreamReader(
		// new FileInputStream(pdfFile.getAbsolutePath())));
		//
		// LzoCompressor.CompressionStrategy strategy =
		// LzoCompressor.CompressionStrategy.LZO1X_1;
		// LzoCompressor lzoCompressor = new LzoCompressor(strategy,
		// lzoBufferSize);
		// BlockCompressorStream bcs = new BlockCompressorStream(
		// new FileOutputStream(lzoOutFile.getAbsolutePath()),
		// lzoCompressor);
		// // LzopOutputStream lzoOut = new LzopOutputStream(new
		// FileOutputStream(
		// // lzoOutFile.getAbsolutePath()), lzoCompressor, lzoBufferSize,
		// // strategy);
		// String textLine;
		// while ((textLine = textBr.readLine()) != null) {
		// textLine += "\n";
		// byte[] bytes = textLine.getBytes();
		// bcs.write(bytes, 0, bytes.length);
		// }
		// textBr.close();
		// bcs.close();
		File bFile = new File("/home/mac", "rink_620.lzo_deflate");
		LzoDecompressor.CompressionStrategy decomstrategy = LzoDecompressor.CompressionStrategy.LZO1X_SAFE;
		LzoDecompressor lzoDeCompressor = new LzoDecompressor(decomstrategy,
				lzoBufferSize);
		BlockDecompressorStream bds = new BlockDecompressorStream(
				new FileInputStream(bFile), lzoDeCompressor);
		BufferedReader lzoBr = new BufferedReader(new InputStreamReader(bds));
		System.out.println(lzoBr.readLine());
	}

	public static void testMapReduce() throws Exception {
		Configuration conf = new Configuration();
		conf.set(
				"io.compression.codecs",
				"org.apache.hadoop.io.compress.GzipCodec,org.apache.hadoop.io.compress.DefaultCodec,org.apache.hadoop.io.compress.BZip2Codec,com.hadoop.compression.lzo.LzoCodec,com.hadoop.compression.lzo.LzoCodec");
		conf.setLong("mapreduce.input.fileinputformat.split.maxsize",
				16L * 1024 * 1024);
		FileSystem fs = FileSystem.get(conf);
		Job job = new Job(fs.getConf(), "Test for LZO");
		job.setNumReduceTasks(1);
		job.setJarByClass(LZOLocalWriter.class);
		job.setMapperClass(TestMapper.class);
		job.setInputFormatClass(PureLzoTextInputFormat.class);
		job.setReducerClass(TestReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);
		job.setMapSpeculativeExecution(false);
		job.setReduceSpeculativeExecution(false);
		Path in = new Path("/home/mac/rink_620.lzo_deflate");
		FileInputFormat.addInputPath(job, in);
		Path out = new Path("/home/mac/rink_620.out");
		if (fs.exists(out)) {
			fs.delete(out, false);
		}
		FileOutputFormat.setOutputPath(job, out);
		job.waitForCompletion(false);
	}

	public static void testLzoIndex() throws Exception {
		Configuration config = new Configuration();
		config.set(
				"io.compression.codecs",
				"org.apache.hadoop.io.compress.GzipCodec,org.apache.hadoop.io.compress.DefaultCodec,org.apache.hadoop.io.compress.BZip2Codec,com.hadoop.compression.lzo.LzoCodec,com.hadoop.compression.lzo.LzoCodec");
		// LzoIndex.createIndex(FileSystem.getLocal(), new
		// Path("/home/mac/rink-10.lzo"));
		LzoIndexer indexer = new LzoIndexer(config);
		indexer.index(new Path("/home/mac/rink_620.lzo_deflate"));
	}

	public static void testLzopIndex() throws Exception {
		File lzoOutFile = new File("/home/mac", "rink-10.lzo");
		Configuration config = new Configuration();
		config.set(
				"io.compression.codecs",
				"org.apache.hadoop.io.compress.GzipCodec,org.apache.hadoop.io.compress.DefaultCodec,org.apache.hadoop.io.compress.BZip2Codec,com.hadoop.compression.lzo.LzoCodec,com.hadoop.compression.lzo.LzopCodec");
		// LzoIndex.createIndex(FileSystem.getLocal(), new
		// Path("/home/mac/rink-10.lzo"));
		LzoIndexer indexer = new LzoIndexer(config);
		indexer.index(new Path("/home/mac/rink-10.lzo"));
	}

	public static void testLzop() throws Exception {

		int lzoBufferSize = 256 * 1024;
		File pdfFile = new File("/home/mac", "nfscookbook.pdf");
		File lzoOutFile = new File("/home/mac", "rink-10.lzo");
		if (lzoOutFile.exists()) {
			lzoOutFile.delete();
		}
		BufferedReader textBr = new BufferedReader(new InputStreamReader(
				new FileInputStream(pdfFile.getAbsolutePath())));
		LzoCompressor.CompressionStrategy strategy = LzoCompressor.CompressionStrategy.LZO1X_1;
		LzoCompressor lzoCompressor = new LzoCompressor(strategy, lzoBufferSize);
		LzopOutputStream os = new LzopOutputStream(new FileOutputStream(
				lzoOutFile), lzoCompressor, lzoBufferSize, strategy);
		String textLine;
		while ((textLine = textBr.readLine()) != null) {
			textLine += "\n";
			byte[] bytes = textLine.getBytes();
			os.write(bytes, 0, bytes.length);
		}
		textBr.close();
		os.close();

		// read
		// LzoDecompressor.CompressionStrategy decomstrategy =
		// LzoDecompressor.CompressionStrategy.LZO1X_SAFE;
		LzopDecompressor lzoDeCompressor = new LzopDecompressor(lzoBufferSize);
		LzopInputStream lis = new LzopInputStream(new FileInputStream(
				lzoOutFile), lzoDeCompressor, lzoBufferSize);

		BufferedReader lzoBr = new BufferedReader(new InputStreamReader(lis));

		// System.out.pritln();
	}
}
