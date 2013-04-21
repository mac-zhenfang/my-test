/**
 * 
 */
package mapreduce;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hive.conf.HiveConf;
import org.apache.hadoop.hive.metastore.HiveMetaStoreClient;
import org.apache.hadoop.hive.metastore.api.Table;
import org.apache.hadoop.hive.ql.Driver;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.mapred.JobHistory.JobInfo;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.junit.Before;
import org.junit.Test;

/**
 * @author root
 * 
 */
public class MetaDataMapReduceTest {

	private HiveMetaStoreClient client;
	protected HiveConf hiveConf;
	protected Driver driver;
	protected final String thriftUri = "thrift://localhost:9083";
	protected final String dbName = "default";
	protected final String tableName = "page";
	protected FileSystem fs;
	final Configuration conf = new Configuration();

	@Before
	public void setUp() throws Exception {
		hiveConf = new HiveConf(this.getClass());

		// The default org.apache.hadoop.hive.ql.hooks.PreExecutePrinter hook
		// is present only in the ql/test directory
		hiveConf.set(HiveConf.ConfVars.PREEXECHOOKS.varname, "");
		hiveConf.set(HiveConf.ConfVars.POSTEXECHOOKS.varname, "");
		hiveConf.set(HiveConf.ConfVars.HIVE_SUPPORT_CONCURRENCY.varname,
				"false");
		driver = new Driver(hiveConf);

		hiveConf.set("hive.metastore.local", "false");
		hiveConf.set(HiveConf.ConfVars.METASTOREURIS.varname, thriftUri);

		client = new HiveMetaStoreClient(hiveConf, null);

		conf.set("fs.default.name", "hdfs://mac-desktop:9000");
		fs = FileSystem.get(conf);
	}

	@Test
	public void testGetMetaData() throws Exception {
		List<String> databases = client.getAllDatabases();
		for (String database : databases) {
			Table table = client.getTable(database, "page");
			System.out.println(table);
		}

	}

	@Test
	public void testGetTableViaHCatalog() throws Exception {
		HCatTableInfo inputInfo = HCatTableInfo.getInputTableInfo(thriftUri,
				null, dbName, tableName, null);
		System.out.println(inputInfo.getTableName());
	}

	@Test
	public void testRunMR() throws Exception {
		MapRead.readCount = 0;

		Configuration conf = new Configuration();
		Job job = new Job(conf, "hcat mapreduce read test");
		job.setJarByClass(this.getClass());
		job.setMapperClass(MetaDataMapReduceTest.MapRead.class);

		// input/output settings
		job.setInputFormatClass(HCatInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);

		HCatTableInfo inputInfo = HCatTableInfo.getInputTableInfo(thriftUri,
				null, dbName, tableName, null);

		HCatInputFormat.setInput(job, inputInfo); // FIXME

		job.setMapOutputKeyClass(BytesWritable.class);
		job.setMapOutputValueClass(Text.class);

		job.setNumReduceTasks(0);

		Path path = new Path(fs.getWorkingDirectory(),
				"mapred/testHCatMapReduceOutput");
		if (fs.exists(path)) {
			fs.delete(path, true);
		}

		TextOutputFormat.setOutputPath(job, path);

		job.waitForCompletion(true);

	}

	public static class MapRead extends
			Mapper<WritableComparable, HCatRecord, BytesWritable, Text> {
		static HCatSchema schema = null;
		static int readCount = 0; // test will be in local mode
		
		@Override
		public void setup(Context context) throws IOException {
			if (null == schema) {
				String jobInfoStr = context.getConfiguration().get(
						HCatConstants.HCAT_KEY_JOB_INFO);
				JobInfo info = (JobInfo) HCatUtil.deserialize(jobInfoStr);
				schema = info.getTableSchema();
			}
		}
		@Override
		public void map(WritableComparable key, HCatRecord value,
				Context context) throws IOException, InterruptedException {
			{
				try {
					System.out.println(key);
					System.out.println(value.getString("id", schema));
					readCount++;
				} catch (Exception e) {
					e.printStackTrace(); // print since otherwise exception is
											// lost
					throw new IOException(e);
				}
			}
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}