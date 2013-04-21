package com.webex.hive.jobs.mapreduce.keybusiness;

import java.io.IOException;
import java.util.Random;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class UserServiceTableReport extends CommonReport {
	private static final String GUEST_KEY_PREFIX = "g:";
	private static final String GUEST_PREFIX = "guest_";
	private static final String USER_PREFIX = "user_";

	private final static byte[] family = Bytes.toBytes("infos");
	private final static byte[] tel = Bytes.toBytes("tel");
	public static String getTel(HTable table, String key) throws IOException {
		Get get = new Get(Bytes.toBytes(key));
		get.addColumn(family, tel);
		Result res = table.get(get);
		return new String(res.getValue(family, tel));
	}

	public static class UserServiceTableMapper extends SafeMapper<Object, Text, Text, Text> {
//		private MapFile.Reader hreader = null;
		private HTable table;
		private IPToCountryReader reader;
		private Text key = new Text();
		private Text value = new Text();
		private Random r = new Random();
		long start = 0;

		@Override
		protected void setup(Context context) throws IOException, InterruptedException {
			super.setup(context);
			FileSystem fs = FileSystem.getLocal(context.getConfiguration());
			reader = new IPToCountryReader(context.getConfiguration());
//			hreader = new MapFile.Reader(fs, "hbaseTestMap", context.getConfiguration());
			table = new HTable(HBaseConfiguration.create(context.getConfiguration()), "u_info");
			start = System.currentTimeMillis();
		}

		@Override
		public void map(Object k, Text line, Context context)
				throws IOException, InterruptedException {
			if (line.charAt(0) == '{') {
				return;
			}
			StringIterator s = new StringIterator(line.toString(), '^');
			String[] in = s.splitToSize(28);
			String le = in[0];
			// le must be JSMonitor
			if (!"JSMonitor".equals(le)) {
				return;
			}
			String ip = in[6];
			if (ip.isEmpty()) {
				return;
			}
			String uid = in[14];
			String ut = in[15];
			String oi = in[16];
			String email = in[17];
			String trackingid = in[27];
			String rowkey = "row-" + String.format("%07d", r.nextInt(2000000 - 1));
			Text telVal = new Text();
			getTel(table, rowkey);
//			hreader.get(new Text(rowkey), telVal);
			String tel = telVal.toString();
			boolean isGuest = uid.isEmpty();
			if (isGuest) {
				if (trackingid.isEmpty()) {
					return;
				}
				key.set(GUEST_KEY_PREFIX + trackingid);
				value.set(ip + "," + reader.ipToCountry(ip) + "," + tel);
			} else {
				if (ut.isEmpty()) {
					return;
				}
				key.set(uid);
				StringBuilder sb = new StringBuilder();
				sb.append(ip);
				sb.append(SEPARATE);
				sb.append(ut);
				sb.append(SEPARATE);
				sb.append(oi);
				sb.append(SEPARATE);
				sb.append(email);
				sb.append(SEPARATE);
				sb.append(reader.ipToCountry(ip));
				sb.append(SEPARATE);
				sb.append(tel);
				value.set(sb.toString());
			}

			context.write(key, value);
		}

		@Override
		protected void cleanup(Context context) throws IOException, InterruptedException {
			super.cleanup(context);
			System.out.println(System.currentTimeMillis() - start);
//			reader.close();
			table.close();
		}
	}

	public static class UserServiceTableCombiner extends SafeReducer<Text, Text, Text, Text> {
		@Override
		public void reduce(Text key, Iterable<Text> values, Context context)
				throws IOException, InterruptedException {
			// if multiple values to one key, only adopt the first one to keep unique in result
			context.write(key, values.iterator().next());
		}
	}

	private static final String NAMED_OUTPUT = "KEYBUSINESS";
	public static class UserServiceTableReducer extends
			SafeReducer<Text, Text, Text, Text> {
		private MultipleOutputs<Text, Text> multipleOutputs;

		@Override
		protected void setup(Context context) throws IOException, InterruptedException {
			super.setup(context);
			multipleOutputs = new MultipleOutputs<Text, Text>(context);
		}

		@Override
		public void reduce(Text key, Iterable<Text> values, Context context)
				throws IOException, InterruptedException {
			// if multiple values to one key, only adopt the first one to keep unique in result
			Text value = values.iterator().next();
			String k = key.toString();
			String prefix;
			if (k.startsWith(GUEST_KEY_PREFIX)) {
				key.set(k.substring(GUEST_KEY_PREFIX.length()));
				prefix = GUEST_PREFIX;
			} else {
				prefix = USER_PREFIX;
			}
			multipleOutputs.write(NAMED_OUTPUT, key, value, prefix);
		}

		@Override
		protected void cleanup(Context context) throws IOException, InterruptedException {
			super.cleanup(context);
			multipleOutputs.close();
		}
	}

	public UserServiceTableReport(Configuration config) throws IOException {
		super(config);
		IPToCountryReader.cache(conf);
//		try {
//			DistributedCache.createSymlink(conf);
//			DistributedCache.addCacheFile(new URI("/hbaseTestMap#hbaseTestMap"), conf);
//		} catch (URISyntaxException e) {
//			// never happen
//		}
	}

	@Override
	protected void fillMapredCommand(Job job) {
		job.setMapperClass(UserServiceTableMapper.class);
		job.setCombinerClass(UserServiceTableCombiner.class);
		job.setReducerClass(UserServiceTableReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);
		job.setNumReduceTasks(8);
		MultipleOutputs.addNamedOutput(job, NAMED_OUTPUT, TextOutputFormat.class,
				Text.class, Text.class);
	}

	protected String getReportPath(String reportRoot, String dateStr) {
		String year = dateStr.substring(0, 4);
		String month = dateStr.substring(5, 7);
		String dayAndAfter = dateStr.substring(8);
		return reportRoot + "/" + year + "/" + month + "/"
				+ dayAndAfter;
	}

	/**
	 * usually rename or merge or next step of job
	 */
	@Override
	protected void postHandler(Job job, FileSystem fs, String dateStr)
			throws Exception {
		String path = getWorkingFolder(dateStr);
		// find first file which should be the only output file
		FileStatus[] files = fs.listStatus(new Path(path));
		for (FileStatus file : files) {
			if (!file.isDir() && file.getLen() > 0) {
				// rename according to part of the file name
				Path currentPath = file.getPath();
				String fileName = currentPath.getName();
				if (!fileName.startsWith("guest_") && !fileName.startsWith("user_")) {
					continue;
				}
				String type = fileName.substring(0, fileName.indexOf("_"));
				fileName = fileName.substring(type.length() + 3);

				Path newFile = new Path(getReportPath(job.getConfiguration().get(type + ".log.root"), dateStr) + fileName);
				if (!fs.exists(newFile.getParent())) {
					fs.mkdirs(newFile.getParent());
				}
				// rename
				fs.delete(newFile, false);
				fs.rename(currentPath, newFile);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		if (args.length < 1) {
			String date = ReportDateTool.getLastDayReportDate();
			args = new String[] { date };
		}

		if (isSuitableArgument(args)) {
			String date = args[0].trim();
			Configuration config = new Configuration();
			config.set("current.date", date);
			new UserServiceTableReport(config).run(date);
		}
	}

}
