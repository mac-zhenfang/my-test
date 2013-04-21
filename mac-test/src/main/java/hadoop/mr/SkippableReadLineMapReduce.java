/**
 * 
 */
package hadoop.mr;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * 
 * @date 2011-7-21
 * @since: mac-test
 * @author mac
 */
public class SkippableReadLineMapReduce {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		Path resultFilePath = new Path("/home/mac/skip/simple/result/0");

		long start = System.currentTimeMillis();
		Configuration conf = new Configuration();

		conf.set("mapreduce.input.skippableinputformat.cacheaddr",
				"/home/mac/skip/simple/cache");
		conf.setInt("mapreduce.input.skippableinputformat.linespermap", 20);

		conf.setLong("mapreduce.input.fileinputformat.split.maxsize", 50);

		FileSystem.get(conf).delete(resultFilePath);

		Job job = new Job(conf, "test skipped mapreduce");

		job.setNumReduceTasks(1);
		job.setInputFormatClass(SkipReadLineInputFormat.class);
		job.setJarByClass(SkippableReadLineMapReduce.class);
		job.setMapperClass(TestMapper.class);
		job.setReducerClass(TestReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		job.setMapSpeculativeExecution(false);
		job.setReduceSpeculativeExecution(false);
		FileInputFormat.addInputPath(job,
				new Path("/home/mac/skip/simple/log/"));
		FileOutputFormat.setOutputPath(job, new Path(
				"/home/mac/skip/simple/result/0"));
		job.waitForCompletion(true);

		long end = System.currentTimeMillis();
		// TODO get the value of the counter & store it somewhere
		System.out.println(" read !!"
				+ job.getCounters().getGroup("FileInputFormatCounters")
						.findCounter("BYTES_READ").getValue());
		System.out.println(" Cost !!" + (end - start));

		FSDataInputStream fis = FileSystem.get(conf).open(
				new Path("/home/mac/skip/simple/result/0/part-r-00000"));
		byte[] bytes = new byte[200];
		while (fis.read(bytes) > 0) {
			System.out.println(new String(bytes));
		}
	}

	public static class TestMapper extends
			Mapper<LongWritable, Text, Text, IntWritable> {
		private final static IntWritable one = new IntWritable(1);
		private Text word = new Text();

		public void map(LongWritable key, Text value, Context context)
				throws IOException, InterruptedException {
			String line = value.toString();
			StringTokenizer tokenizer = new StringTokenizer(line);
			while (tokenizer.hasMoreTokens()) {
				word.set(tokenizer.nextToken());
				context.write(word, one);
			}
		}
	}

	public static class TestReducer extends
			Reducer<Text, IntWritable, Text, IntWritable> {
		public void reduce(Text key, Iterable<IntWritable> values,
				Context context) throws IOException, InterruptedException {
			int sum = 0;
			for (IntWritable val : values) {
				sum += val.get();
			}
			context.write(key, new IntWritable(sum));
		}
	}

}
