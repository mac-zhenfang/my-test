package hadoop.security;

import java.io.IOException;
import java.security.Principal;
import java.security.PrivilegedExceptionAction;
import java.util.Set;
import java.util.StringTokenizer;

import javax.security.auth.Subject;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.security.UserGroupInformation;

public class SecureMR {
	public static class TestMapper extends
			Mapper<LongWritable, Text, Text, IntWritable> {
		private final static IntWritable one = new IntWritable(1);
		private Text word = new Text();

		public void map(LongWritable key, Text value, Context context)
				throws IOException, InterruptedException {
			String line = new String(value.getBytes());

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

	public static void main(String[] args) throws Exception {
		
		System.out.println(" ~~~~!~ ");
		Subject subject = new Subject();
		Set<Principal> principals = subject.getPrincipals();
		principals.add(new User("wbx11"));
//		UserGroupInformation result =new UserGroupInformation(subject);
		UserGroupInformation.getLoginUser();
		UserGroupInformation ugi = UserGroupInformation.createRemoteUser("dms");
		ugi.doAs(new PrivilegedExceptionAction<Void>() {

			@Override
			public Void run() throws Exception {	
				Configuration conf = new Configuration();
				conf.set("fs.default.name", "hdfs://10.224.203.97:9000");
				// conf.set(
				// "io.compression.codecs",
				// "org.apache.hadoop.io.compress.GzipCodec,org.apache.hadoop.io.compress.DefaultCodec,org.apache.hadoop.io.compress.BZip2Codec,com.hadoop.compression.lzo.LzoCodec,com.hadoop.compression.lzo.LzoCodec");

				conf.set("mapred.child.java.opts", "-Xmx1024m");

				Job job = new Job(conf, "test skipped mapreduce");

				job.setNumReduceTasks(1);
				job.setJarByClass(SecureMR.class);
				job.setMapperClass(TestMapper.class);
				job.setReducerClass(TestReducer.class);
				job.setOutputKeyClass(Text.class);
				job.setOutputValueClass(IntWritable.class);
				FileInputFormat.setInputPaths(job, new Path("/other"));
				FileOutputFormat.setOutputPath(job,
						new Path("/mac/report-other-3"));
				job.waitForCompletion(true);
				return null;
			}
		});

	}
}

class User implements Principal {
	final String name;

	public User(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
