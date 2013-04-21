/**
 * 
 */
package hive;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hive.ql.io.RCFile;
import org.apache.hadoop.hive.ql.io.RCFile.Reader;
import org.apache.hadoop.hive.ql.io.RCFile.Writer;
import org.apache.hadoop.hive.serde2.columnar.BytesRefArrayWritable;
import org.apache.hadoop.hive.serde2.columnar.BytesRefWritable;
import org.junit.Before;
import org.junit.Test;

/**
 * @author root
 * 
 */
public class RCFileTestr {

	FileSystem fs;
	final Configuration conf = new Configuration();
	final Path folder = new Path("/test");
	final Path rcFile = new Path("/test", "rcfile_time_"
			+ System.currentTimeMillis());

	@Before
	public void before() throws Exception {
		conf.set("fs.default.name", "hdfs://mac-desktop:9000");
		conf.setInt("hive.io.rcfile.column.number.conf", 10);
		fs = FileSystem.get(conf);
	}

	@Test
	public void testWrite() throws Exception {

		if (fs.exists(folder)) {
			fs.delete(folder, true);
		}
		fs.mkdirs(folder);
		Writer fileWriter = new RCFile.Writer(fs, conf, rcFile);
		BytesRefArrayWritable test = new BytesRefArrayWritable();
		for (int i = 0; i < 10; i++) {
			test.set(i, getRef("text_" + i));
		}
		fileWriter.append(test);
		fileWriter.close();
	}

	@Test
	public void testAppend() throws Exception {
		Writer fileWriter = new RCFile.Writer(fs, conf, rcFile);
		for (int row = 0; row < 100000; row++) {
			BytesRefArrayWritable test = new BytesRefArrayWritable();
			for (int i = 0; i < 10; i++) {
				test.set(i, getRef("append_1000" + i));
			}
			fileWriter.append(test);
		}
		fileWriter.close();
	}

	@Test
	public void testCompress() throws Exception {

	}

	private BytesRefWritable getRef(String text) {
		System.out.println("~~ write ref " + text);
		BytesRefWritable ref = new BytesRefWritable();
		ref.set(text.getBytes(), 0, text.getBytes().length);
		return ref;
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
//		FileStatus[] statusArr = fs.listStatus(folder);
//		for (FileStatus stat : statusArr) {
			Path path = new Path("/test/rcfile_time_1322126691125");
			System.out.println(path);
			Reader fileReader = new RCFile.Reader(fs, path, conf);
			BytesRefArrayWritable ret = new BytesRefArrayWritable();
			fileReader.getColumn(0, ret);
			for (int i = 0; i < ret.size(); i++) {
				System.out.println(new String(ret.get(i).getData()));
			}
			fileReader.close();
		//}
		
	}

	

	public static void main(String... args) throws Exception {
		System.out.println(~1000);
	}
}