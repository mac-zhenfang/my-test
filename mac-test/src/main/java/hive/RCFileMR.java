/**
 * 
 */
package hive;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hive.ql.io.RCFile;
import org.apache.hadoop.hive.ql.io.RCFile.Reader;
import org.apache.hadoop.hive.serde2.columnar.BytesRefArrayWritable;
import org.apache.hadoop.hive.serde2.columnar.BytesRefWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.compress.GzipCodec;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;
import org.junit.Before;
import org.junit.Test;

/**
 * @author root
 * 
 */
public class RCFileMR {
	public static class TestMapper extends MapReduceBase implements
			Mapper<Text, Text, Text, Text> {

		@Override
		public void map(Text key, Text value,
				OutputCollector<Text, Text> output, Reporter arg3)
				throws IOException {

			output.collect(key, value);
		}
	}

	public static class TestReducer extends MapReduceBase implements
			Reducer<Text, Text, Text, Text> {

		@Override
		public void reduce(Text key, Iterator<Text> values,
				OutputCollector<Text, Text> output, Reporter arg3)
				throws IOException {
			// TODO Auto-generated method stub
			while (values.hasNext()) {
				output.collect(key, values.next());
			}
		}
	}

	public static void main(String... args) throws Exception {
		System.out.println("~~~~~@!~~~");

		// JobConf conf = new JobConf(RCFileMR.class);
		// conf.set("fs.default.name", "hdfs://mac-desktop:9000");
		// conf.setJobName("gziptest");
		//
		// conf.setOutputKeyClass(Text.class);
		// conf.setOutputValueClass(Text.class);
		//
		// conf.setMapperClass(TestMapper.class);
		// conf.setReducerClass(TestReducer.class);
		//
		// conf.setInputFormat(KeyValueTextInputFormat.class);
		// conf.setOutputFormat(TextOutputFormat.class);
		//
		// FileInputFormat.setInputPaths(conf, new Path("/gzip"));
		// FileOutputFormat.setOutputPath(conf,
		// new Path("/output/" + System.currentTimeMillis()));
		// System.out.println(conf.get("mapred.output.dir"));
		// conf.setBoolean("mapred.output.compress", true);
		// conf.setClass("mapred.output.compression.codec", GzipCodec.class,
		// CompressionCodec.class);
		//
		// JobClient.runJob(conf);
	}

	static FileSystem fs;

	static Configuration conf = new Configuration();
	static Path folder = new Path("/rcgzip/2011/11/25");
	static List<String> arr = new ArrayList<String>();
	Path[] joinPages = new Path[] { new Path("/page/2011/12/01"),
			new Path("/user/2011/12/01"), new Path("/org/2011/12/01") };

	@Before
	public void before() throws Exception {
		conf.set("fs.default.name", "hdfs://mac-desktop:9000");
		conf.setInt("hive.io.rcfile.column.number.conf", 4);
		fs = FileSystem.get(conf);
		if (!fs.exists(folder)) {
			fs.mkdirs(folder);
		}

		arr.add(UUID.randomUUID().toString());
		arr.add("Name: ");
		arr.add("Wen san lu....");
		arr.add((new Date()).toGMTString());
	}

	@Test
	public void testCreatePageUserOrgTable() throws Exception {
		int userRows = 1000000;
		int pageRows = 5000000;
		int orgRows = 5000;

		// cols
		int userCols = 2;
		int pageCols = 4;
		int orgCols = 2;
		String userIdPrefix = "user_";
		String orgIdPrefix = "org_";
		String pageIdPrefix = "page_";

		for (Path path : joinPages) {
			if (!fs.exists(path)) {
				fs.mkdirs(path);
			}
		}
		// create user data
		Path userFolder = joinPages[1];

		RCFile.Writer userFolderWriter = new RCFile.Writer(fs, conf, new Path(
				userFolder, "11_" + System.currentTimeMillis()), null, null,
				new GzipCodec());
		for (int i = 0; i < userRows; i++) {
			BytesRefArrayWritable rows = new BytesRefArrayWritable(userCols);
			String userId = userIdPrefix + i;
			BytesRefWritable useridBRW = new BytesRefWritable(userId.getBytes());
			rows.set(0, useridBRW);
			String userName = "mac_" + i;
			BytesRefWritable userNameBRW = new BytesRefWritable(
					userName.getBytes());
			rows.set(1, userNameBRW);
			userFolderWriter.append(rows);
		}
		userFolderWriter.close();
		//end create
		
		// create org data
		Path orgFolder = joinPages[2];
		RCFile.Writer orgFolderWriter = new RCFile.Writer(fs, conf, new Path(
				orgFolder, "11_" + System.currentTimeMillis()), null, null,
				new GzipCodec());
		for (int i = 0; i < orgRows; i++) {
			BytesRefArrayWritable rows = new BytesRefArrayWritable(orgCols);
			String orgId = orgIdPrefix + i;
			BytesRefWritable orgIdBRW = new BytesRefWritable(orgId.getBytes());
			rows.set(0, orgIdBRW);
			String orgName = "cisco_"+i;
			BytesRefWritable orgNameBRW = new BytesRefWritable(orgName.getBytes());
			rows.set(1, orgNameBRW);
			orgFolderWriter.append(rows);
		}
		orgFolderWriter.close();
		//end create
		
		// create page data
		Path pageFolder = joinPages[0];
		RCFile.Writer pageFolderWriter = new RCFile.Writer(fs, conf, new Path(
				pageFolder, "11_" + System.currentTimeMillis()), null, null,
				new GzipCodec());
		for (int i = 0; i < pageRows; i++) {
			BytesRefArrayWritable rows = new BytesRefArrayWritable(pageCols);
			// pageId
			String pageId = pageIdPrefix + i;
			BytesRefWritable pageIdBRW = new BytesRefWritable(pageId.getBytes());
			rows.set(0, pageIdBRW);
			// pageName
			String pageName = "page_" + i;
			BytesRefWritable pageNameBRW = new BytesRefWritable(pageName.getBytes());
			rows.set(1, pageNameBRW);
			//userId
			String userId = userIdPrefix + ((i*userRows+i)%userRows);
			BytesRefWritable userIdBRW = new BytesRefWritable(userId.getBytes());
			rows.set(2, userIdBRW);
			//orgId
			String orgId = orgIdPrefix + ((i*orgRows+i)%orgRows);
			BytesRefWritable orgIdBRW = new BytesRefWritable(orgId.getBytes());
			rows.set(3, orgIdBRW);
			pageFolderWriter.append(rows);
		}
		pageFolderWriter.close();
	}

	@Test
	public void testAddGzio() throws Exception {
		if (!fs.exists(new Path("/gzip"))) {
			fs.mkdirs(new Path("/gzip"));
		}
		OutputStream fsout = fs.create(new Path("/gzip/test_"
				+ System.currentTimeMillis()));
		GZIPOutputStream out = new GZIPOutputStream(fsout);
		int i = 0;
		while (i++ < 10000000) {
			out.write("mac,".getBytes());
			out.write("30,".getBytes());
			out.write("cisco\n".getBytes());
		}
		out.close();
	}

	@Test
	public void testAddRCFile() throws Exception {
		int rows = 1000000;
		int cols = arr.size();
		RCFile.Writer writer = new RCFile.Writer(fs, conf, new Path(folder,
				"11_" + System.currentTimeMillis()), null, null, null);

		for (int i = 0; i < rows; i++) {
			BytesRefArrayWritable row = new BytesRefArrayWritable(cols);
			for (int j = 0; j < cols; j++) {
				String t = arr.get(j);
				if (j == 2) {
					// changeable name
					t += System.currentTimeMillis();
				}
				BytesRefWritable w = new BytesRefWritable(t.getBytes());
				row.set(j, w);
			}
			writer.append(row);
		}
		writer.close();
	}

	@Test
	public void testAddRCFileGzip() throws Exception {
		int rows = 1000000;
		int cols = arr.size();
		RCFile.Writer writer = new RCFile.Writer(fs, conf, new Path(folder,
				"11_" + System.currentTimeMillis()), null, null,
				new GzipCodec());

		for (int i = 0; i < rows; i++) {
			BytesRefArrayWritable row = new BytesRefArrayWritable(cols);
			for (int j = 0; j < cols; j++) {
				String t = arr.get(j);
				if (j == 2) {
					// changeable name
					t += System.currentTimeMillis();
				}
				BytesRefWritable w = new BytesRefWritable(t.getBytes());
				row.set(j, w);
			}
			writer.append(row);
		}
		writer.close();
	}

	@Test
	public void testRead() throws Exception {
		FileStatus[] statusArr = fs.listStatus(folder);
		for (FileStatus stat : statusArr) {
			Path path = stat.getPath();
			System.out.println(path);
			readRC(path);
		}
	}

	private void readRC(Path file) throws Exception {
		Reader fileReader = new RCFile.Reader(fs, file, conf);
		BytesRefArrayWritable ret = new BytesRefArrayWritable();
		while (fileReader.nextColumnsBatch()) {
			fileReader.getCurrentRow(ret);
		}
		for (int i = 0; i < ret.size(); i++) {
			System.out.println(new String(ret.get(i).getData()));
		}
		fileReader.close();
	}

	@Test
	public void testReadColumn() throws Exception {
		// FileStatus[] statusArr = fs.listStatus(folder);
		// for (FileStatus stat : statusArr) {
		Path path = new Path("/rcgzip/2011/11/25/11_1322632282016");
		System.out.println(path);
		Reader fileReader = new RCFile.Reader(fs, path, conf);
		BytesRefArrayWritable ret = new BytesRefArrayWritable();
		while (fileReader.nextColumnsBatch()) {
			fileReader.getCurrentRow(ret);
		}
		for (int i = 0; i < ret.size(); i++) {
			System.out.println(new String(ret.get(i).getData()));
		}
		fileReader.close();
		// }

	}
}