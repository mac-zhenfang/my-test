/**
 * 
 */
package hbase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HRegionInfo;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.KeyValue.KVComparator;
import org.apache.hadoop.hbase.KeyValue.Type;
import org.apache.hadoop.hbase.TableNotFoundException;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HConnection;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Row;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.ServerCallable;
import org.apache.hadoop.hbase.filter.ColumnPaginationFilter;
import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp;
import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.filter.FilterList;
import org.apache.hadoop.hbase.filter.FilterList.Operator;
import org.apache.hadoop.hbase.filter.SingleColumnValueFilter;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.hbase.io.hfile.HFile;
import org.apache.hadoop.hbase.mapreduce.HFileOutputFormat;
import org.apache.hadoop.hbase.mapreduce.TableMapper;
import org.apache.hadoop.hbase.mapreduce.TableReducer;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.RecordWriter;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.TaskAttemptID;
import org.junit.Before;
import org.junit.Test;

/**
 * @author mac http://sujee.net/tech/articles/hbase-map-reduce-freq-counter/
 */
public class TestHBase {

	static HBaseConfiguration config;
	static String tableStr = "TESTTABLE";
	static String family = "FAMILY";
	static String detail = "detail";
	static String COLUMN = "COLUMN";
	static String INCREMENT = "INCREMENT";
	static String INDEX_TABLE_NAME = "TESTTABLE-COLUMN";
	static String INDEX_COLUMN_FAMILY = "INDEX";
	static String[] alphabet = new String[] { "a", "b", "c", "d", "e", "f",
			"g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
			"t", "u", "v", "w", "x", "y", "z" };
	static String[] testData = new String[] { "Test", "Data", "Admin", "Mac",
			"net", "tech", "map", "reduce", "counter", "articles" };

	@Before
	public void setup() {
		if (null == config) {
			config = new HBaseConfiguration();
			config.setLong("hbase.regionserver.lease.period", 10000000);
			config.setLong("hbase.rpc.timeout", 1000000);
			config.set("hbase.zookeeper.quorum", "127.0.0.1");
			config.set("hbase.zookeeper.property.clientPort", "2181");
		}
	}

	@Test
	public void testIncrementValue() throws Exception {

		final HTable table = new HTable(config, tableStr.getBytes());
		ExecutorService pool = Executors.newFixedThreadPool(10);
		int i = 0;
		while (i < 100000) {
			pool.submit(new Callable() {

				public Object call() throws Exception {
					table.incrementColumnValue(
							Bytes.toBytes("test-testIncrementValue"),
							Bytes.toBytes(family), Bytes.toBytes(INCREMENT),
							(long) 1);
					return null;
				}
			});
			i++;
			byte[] row = Bytes.toBytes("test-testIncrementValue");
			Get get = new Get(row);
			Result result = table.get(get);
			byte[] val = result.getValue(Bytes.toBytes(family),
					Bytes.toBytes(INCREMENT));
			System.out.println("Value: " + Bytes.toLong(val));
		}

	}

	@Test
	public void testTailMap() throws Exception {
		KeyValue kv1 = KeyValue.createFirstOnRow(Bytes.toBytes(tableStr),
				Bytes.toBytes(family), Bytes.toBytes(COLUMN));
		KeyValue kv2 = new KeyValue(Bytes.toBytes(tableStr),
				Bytes.toBytes(family), Bytes.toBytes(COLUMN),
				System.currentTimeMillis(), Type.Put);
		KVComparator comparator = new KVComparator();
		List<KeyValue> arrays = new ArrayList<KeyValue>();
		arrays.add(kv1);
		arrays.add(kv2);
		Collections.sort(arrays, comparator);
		System.out.println(arrays);
	}

	public static void main(String[] args) throws Exception {
//		List<Integer> arrays = new ArrayList<Integer>();
//		arrays.add(2);
//		arrays.add(0);
//		arrays.add(1);
//		 
//		Collections.sort(arrays, new Comparator<Integer>() {
//
//			public int compare(Integer o1, Integer o2) {
//
//				return -Integer.compare(o1, o2);
//			}
//		});
//		System.out.println(arrays);
		System.out.println(System.currentTimeMillis());
	}

	@Test
	public void testCreateHFile() throws Exception {
		Configuration conf = new Configuration();
		conf.set("mapred.output.dir", "D:\\projects");
		Job job = new Job(conf, "testLocalMRIncrementalLoad");
		TaskAttemptContext context = new TaskAttemptContext(
				job.getConfiguration(), new TaskAttemptID());
		//

		HFileOutputFormat hof = new HFileOutputFormat();
		RecordWriter<ImmutableBytesWritable, KeyValue> writer = hof
				.getRecordWriter(context);
		byte keyBytes[] = new byte[Bytes.SIZEOF_INT];
		for (int i = 0; i < 1000; i++) {
			Bytes.putInt(keyBytes, 0, i);
			byte[] valBytes = ("valuevalue_" + i).getBytes();
			ImmutableBytesWritable key = new ImmutableBytesWritable(keyBytes);
			KeyValue kv = new KeyValue(keyBytes, family.getBytes(),
					COLUMN.getBytes(), valBytes);
			writer.write(key, kv);
		}
		writer.close(context);

	}

	@Test
	public void testHFileLoad() throws Exception {
		HTable table = new HTable(config, tableStr.getBytes());
		String pa = "D:\\projects\\_temporary\\_attempt__0000_r_000000_0\\FAMILY\\3135047613975372778";
		Configuration conf = new Configuration();
		final Path hfilePath = new Path(pa);
		final FileSystem fs = hfilePath.getFileSystem(conf);
		HFile.Reader hfr = new HFile.Reader(fs, hfilePath, null, false);
		final byte[] first, last;
		try {
			hfr.loadFileInfo();
			first = hfr.getFirstRowKey();
			last = hfr.getLastRowKey();
		} finally {
			hfr.close();
		}

		HConnection conn = table.getConnection();
		conn.getRegionServerWithRetries(new ServerCallable<Void>(conn, tableStr
				.getBytes(), first) {

			public Void call() throws Exception {
				HRegionInfo hri = location.getRegionInfo();
				byte[] regionName = location.getRegionInfo().getRegionName();
				server.bulkLoadHFile(hfilePath.toString(), regionName,
						family.getBytes());
				return null;
			}
		});
	}

	@Test
	public void testCreateTable() throws IOException {
		HBaseAdmin admin = new HBaseAdmin(config);
		HTableDescriptor htd = new HTableDescriptor(tableStr);
		HColumnDescriptor hcd = new HColumnDescriptor(family);
		htd.addFamily(hcd);
		admin.createTable(htd);
	}
	
	@Test
	public void testCreateRawDataTable() throws IOException {
		HBaseAdmin admin = new HBaseAdmin(config);
		HTableDescriptor htd = new HTableDescriptor("RAWDATA");
		HColumnDescriptor hcd = new HColumnDescriptor("META-DATA");
		HColumnDescriptor hcd2 = new HColumnDescriptor("PARTITION");
		htd.addFamily(hcd);
		htd.addFamily(hcd2);
		admin.createTable(htd);
	}
	@Test
	public void testCreateBgpTable ()  throws IOException {
		HBaseAdmin admin = new HBaseAdmin(config);
		HTableDescriptor htd = new HTableDescriptor("BGP");
		HColumnDescriptor hcd = new HColumnDescriptor("PREFIX_MESSAGE"); // key PREFIX, value message1, message2
		htd.addFamily(hcd);
		admin.createTable(htd);
	}
	@Test
	public void testReadDataAndSendToBgpTable ()  throws IOException {
		// read data 
	}
	

	@Test
	public void testCreateIndexTable() throws IOException {
		HBaseAdmin admin = new HBaseAdmin(config);
		HTableDescriptor htd = new HTableDescriptor(INDEX_TABLE_NAME);
		HColumnDescriptor hcd = new HColumnDescriptor(INDEX_COLUMN_FAMILY);
		htd.addFamily(hcd);
		htd.addFamily(hcd);
		admin.createTable(htd);
	}

	@Test
	public void testAddData() throws IOException {
		HTable table = new HTable(config, tableStr.getBytes());
		for (int i = 0; i < 1000; i++) {
			byte[] row = Bytes.toBytes(alphabet[i % alphabet.length] + i);
			Put put = new Put(row);
			put.add(family.getBytes(), COLUMN.getBytes(), testData[i
					% testData.length].getBytes());
			table.put(put);
		}
	}

	@Test
	public void testCompare() throws IOException {

	}

	@Test
	public void testGetData() throws IOException {
		HTable table = new HTable(config, tableStr.getBytes());
		byte[] row = Bytes.toBytes("a");
		Scan scan = new Scan();
		ResultScanner scanner = table.getScanner(scan);
		Iterator<Result> it = scanner.iterator();
		int i = 0;
		while (it.hasNext()) {
			Result result = it.next();
			System.out.println(result);
		}
	}

	@Test
	public void testIndexScanner() throws Exception {
		Scan scan = new Scan();

		ColumnPaginationFilter filter = new ColumnPaginationFilter(1, 0);

		long starttime = System.currentTimeMillis();
		scan.setFilter(filter);
		scan.setBatch(100);
		scan.addFamily(Bytes.toBytes(INDEX_COLUMN_FAMILY));
		HTable table = new HTable(config, INDEX_TABLE_NAME.getBytes());
		ResultScanner scanner = table.getScanner(scan);

		Iterator<Result> it = scanner.iterator();
		int i = 0;
		while (it.hasNext()) {
			Result result = it.next();
			System.out.println(result);
			i++;
		}
		System.out.println(" total : " + i + " time "
				+ (System.currentTimeMillis() - starttime));
	}

	@Test
	public void testScanner() throws IOException, InterruptedException {
		String mrTable = tableStr;
		// prepareTable(mrTable, cfs);
		// prepareData(mrTable, cfs[0], "sc", "sc", "sc", 100, 5);
		Scan scan = new Scan();

		ColumnPaginationFilter filter = new ColumnPaginationFilter(1, 0);

		long starttime = System.currentTimeMillis();
		scan.setFilter(filter);
		scan.setBatch(100);
		scan.addFamily(Bytes.toBytes(family));
		HTable table = new HTable(config, mrTable.getBytes());
		ResultScanner scanner = table.getScanner(scan);

		Iterator<Result> it = scanner.iterator();
		int i = 0;
		while (it.hasNext()) {
			Result result = it.next();
			System.out.println(result);
			i++;
		}
		System.out.println(" total : " + i + " time "
				+ (System.currentTimeMillis() - starttime));
	}

	@Test
	public void testScanSingleColumnValueFilter() throws Exception {
		String mrTable = tableStr;
		byte[] col1 = Bytes.toBytes(COLUMN);
		byte[] famA = Bytes.toBytes(family);

		HTable hTable = new HTable(config, mrTable.getBytes());

		Scan scan = new Scan(Bytes.toBytes("a"), Bytes.toBytes("f"));
		scan.addColumn(famA, col1);
		scan.setCaching(10);
		scan.setBatch(1);
		SingleColumnValueFilter singleColumnValueFilterA = new SingleColumnValueFilter(
				famA, col1, CompareOp.EQUAL, Bytes.toBytes("Admin"));
		SingleColumnValueFilter singleColumnValueFilterB = new SingleColumnValueFilter(
				famA, col1, CompareOp.EQUAL, Bytes.toBytes("Test"));

		singleColumnValueFilterA.setFilterIfMissing(true);
		FilterList filter = new FilterList(Operator.MUST_PASS_ONE,
				Arrays.asList((Filter) singleColumnValueFilterA,
						singleColumnValueFilterB));
		scan.setFilter(filter);

		ResultScanner scanner = hTable.getScanner(scan);
		for (Result result : scanner) {
			System.out.println(Bytes.toString(result.getValue(famA, col1)));
		}

	}

	@Test
	public void testMapReduceCounter() throws Exception {
		String mrTable = "mr_" + System.nanoTime();
		String[] cfs = new String[] { "columnfamily_" + System.nanoTime() };
		prepareTable(mrTable, cfs);
		prepareData(mrTable, cfs[0], "mr", "mr", "mr", 100, 1);
		System.out.println(" ~~~~ done prepre ~~~~");

	}

	// @Test
	// public void testMapReduceWbx11() throws Exception {
	// HBaseConfiguration conf = new HBaseConfiguration();
	// Job job = new Job(conf, "Hbase_FreqCounter2");
	// job.setJarByClass(Wbx11TrackingMR.class);
	// Scan scan = new Scan();
	// scan.addFamily(Bytes.toBytes(family));
	// TableMapReduceUtil.initTableMapperJob(tableStr, scan,
	// WBX11_CounterMapper.class, ImmutableBytesWritable.class,
	// IntWritable.class, job);
	// TableMapReduceUtil.initTableReducerJob(tableStr,
	// WBX11_CounterReduce.class, job);
	// job.waitForCompletion(true);
	//
	// }

	/**
	 * Every kind of table can add an observer
	 * */
	@Test
	public void testObserver() throws Exception {
		HBaseAdmin admin = new HBaseAdmin(config);

		byte[] table = tableStr.getBytes();
		try {
			if (admin.getTableDescriptor(tableStr.getBytes()) == null) {

			} else {
				System.out.println(" :::::::::: the table exits..");
			}
		} catch (TableNotFoundException e) {
			HTableDescriptor htd = new HTableDescriptor(table);
			htd.addFamily(new HColumnDescriptor(family));
			htd.addFamily(new HColumnDescriptor(detail));
			htd.setValue("FIXED_COPROCESSOR_TRACKING_MAPREDUCE",
					"org.apache.hadoop.hbase.mac.Wbx11TrackingMapReduceObserver");
			admin.createTable(htd);
		}
		// Parameter 1: this is where the jar which contains the Observer class
		// put + System.currentTimeMillis()
		// Parameter 2: this is the running class
		// Parameter 3: this is the priority
		/*
		 * RowKey: sessionId + ts
		 */
		String sessionId = UUID.randomUUID().toString();
		HTable hTable = new HTable(config, table);
		for (int i = 0; i < 1000; i++) {
			byte[] row = Bytes.toBytes(sessionId.replaceAll("-", "") + "-"
					+ System.nanoTime());
			Put put = new Put(row);
			put.add(Bytes.toBytes(family),
					Bytes.toBytes("pageId"),
					Bytes.toBytes("pageId"
							+ UUID.randomUUID().toString().replaceAll("-", "")));
			put.add(Bytes.toBytes(family), Bytes.toBytes("ts"),
					Bytes.toBytes(System.currentTimeMillis()));
			put.add(Bytes.toBytes(family), Bytes.toBytes("browser"),
					Bytes.toBytes("Mozilla"));
			hTable.put(put);
		}
	}

	// public static class PostObserver extends BaseRegionObserverCoprocessor {
	// @Override
	// public void postPut(final RegionCoprocessorEnvironment e,
	// final Map<byte[], List<KeyValue>> familyMap,
	// final boolean writeToWAL) throws IOException {
	// System.out.println("PostObserver ~~ " + System.currentTimeMillis());
	// try {
	// Thread.sleep(10);
	// } catch (InterruptedException ex) {
	// }
	// }
	// }

	private static void readTable(String mrTable, String[] cfs)
			throws Exception {
		long starttime = System.currentTimeMillis();
		Scan scan = new Scan();
		scan.addFamily(cfs[0].getBytes());
		scan.setBatch(100);
		HTable table = new HTable(config, mrTable.getBytes());
		ResultScanner scanner = table.getScanner(scan);
		Iterator<Result> it = scanner.iterator();
		int i = 0;
		while (it.hasNext()) {
			Result result = it.next();
			ImmutableBytesWritable b = result.getBytes();

			i++;
		}
		System.out.println(" total : " + i + " time "
				+ (System.currentTimeMillis() - starttime));
	}

	private static void prepareTable(String tableName, String[] columnFamilyName)
			throws IOException {
		HBaseAdmin admin = new HBaseAdmin(config);
		System.out.println(" .... create a new table ...");

		HTableDescriptor htd = new HTableDescriptor(tableName);
		for (String cf : columnFamilyName) {
			HColumnDescriptor hcd = new HColumnDescriptor(cf);
			htd.addFamily(hcd);
		}
		admin.createTable(htd);
	}

	private static void prepareData(String tableName, String columnFamily,
			String rowPrefix, String columnPrefix, String valuePrefix,
			int howManyRows, int howManyColumns) throws IOException,
			InterruptedException {
		HTable table = new HTable(config, tableName.getBytes());
		List<Row> actions = new ArrayList<Row>();
		for (int i = 0; i < howManyRows; i++) {
			byte[] row = Bytes.toBytes(rowPrefix + "_row_" + i + "_"
					+ System.nanoTime());
			Put put = new Put(row);
			for (int j = 0; j < howManyColumns; j++) {
				put.add(columnFamily.getBytes(), (columnPrefix + "_column")
						.getBytes(),
						(valuePrefix + "_test_data_" + j + "_" + System
								.nanoTime()).getBytes());
			}

			actions.add(put);
		}
		table.batch(actions);
		table.close();
	}

	public static class CounterMapper extends
			TableMapper<ImmutableBytesWritable, IntWritable> {
		private int numRecords = 0;
		private static final IntWritable one = new IntWritable(1);

		@Override
		public void map(ImmutableBytesWritable row, Result values,
				Context context) throws IOException {
			// extract userKey from the compositeKey (userId + counter)
			ImmutableBytesWritable userKey = new ImmutableBytesWritable(
					row.get(), 0, Bytes.SIZEOF_INT);
			try {
				context.write(userKey, one);
			} catch (InterruptedException e) {
				throw new IOException(e);
			}
			numRecords++;
			if ((numRecords % 10000) == 0) {
				context.setStatus("mapper processed " + numRecords
						+ " records so far");
			}
		}
	}

	public static class CounterReduce
			extends
			TableReducer<ImmutableBytesWritable, IntWritable, ImmutableBytesWritable> {
		public void reduce(ImmutableBytesWritable key,
				Iterable<IntWritable> values, Context context)
				throws IOException, InterruptedException {
			int sum = 0;
			for (IntWritable val : values) {
				sum += val.get();
			}

			Put put = new Put(key.get());
			put.add(Bytes.toBytes("details"), Bytes.toBytes("total"),
					Bytes.toBytes(sum));
			System.out.println(String.format("stats :   key : %d,  count : %d",
					Bytes.toInt(key.get()), sum));
			context.write(key, put);
		}
	}

}