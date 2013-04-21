/**
 * 
 */
package hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hive.conf.HiveConf;
import org.apache.hadoop.hive.metastore.HiveMetaStoreClient;
import org.apache.hadoop.hive.ql.session.SessionState;
import org.junit.Before;
import org.junit.Test;

/**
 * @author root
 * 
 */
public class HiveDBConnTest {

	private Connection con;
	private static String driverName = "org.apache.hadoop.hive.jdbc.HiveDriver";
	private static String TEST_TABLE = "TEST_TABLE_1";
	private static String data_path = "C:/hive/1354436041990.log";

	@Before
	public void setUp() throws Exception {
		System.out.println("test ");
		Class.forName(driverName);
		con = DriverManager.getConnection(
				"jdbc:hive://localhost:10000/metastore_db", "mac", "123");
	}

	@Test
	public void testCombineSQL() throws Exception {
		Statement stmt = con.createStatement();
		// ResultSet set =
		// stmt.executeQuery("grant ALL on database default to user zhefang");
		ResultSet set = stmt
				.executeQuery("set hive.a.b.c=a;grant SELECT on table TEST_TABLE_1 to user/group/role zhefang");
		System.out.println(set.next());
	}

	@Test
	public void testOnlyConnection() {
		System.out.println("test test ");
	}

	@Test
	public void testGrantUserDataBase() throws Exception {
		Statement stmt = con.createStatement();
		// ResultSet set =
		// stmt.executeQuery("grant ALL on database default to user zhefang");
		ResultSet set = stmt
				.executeQuery("grant SELECT on table TEST_TABLE_1 to user/group/role zhefang");
		System.out.println(set.next());
	}

	@Test
	public void testTestCreateIndex() throws Exception {

	}

	@Test
	public void testPathRelative() throws Exception {
		Path pa = new Path(
				"file",
				null,
				"C:\\Users\\zhefang\\AppData\\Local\\Temp\\zhefang\\hive_2012-05-25_21-08-20_765_4165455223096927703");
	}

	@Test
	public void testShowtables() throws Exception {
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery("show tables");
		while (set.next()) {
			System.out.println(set.getString("tab_name"));
		}
	}

	@Test
	public void testSelect() throws Exception {
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery("select * from TEST_TABLE_1");
		while (set.next() == true) {
			System.out.println(set.getString("action"));
		}
	}

	@Test
	public void testGroup() throws Exception {
		Statement stmt = con.createStatement();
		long start = System.currentTimeMillis();
		ResultSet set = stmt
				.executeQuery("select count(action) as num, action from "
						+ TEST_TABLE + " group by action");
		while (set.next() == true) {
			System.out.println(set.getString("action") + " number: "
					+ set.getInt("num"));
		}
		long end = System.currentTimeMillis();
		System.out.println(" cost: " + (end - start));
	}

	@Test
	public void testDropTables() throws Exception {
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery("drop table TEST_TABLE_1");
		System.out.println(set.next());
	}

	@Test
	public void testCreateTable() throws Exception {
		Statement stmt = con.createStatement();
		stmt.executeQuery("drop table " + TEST_TABLE);
		stmt = con.createStatement();
		ResultSet set = stmt
				.executeQuery("CREATE TABLE IF NOT EXISTS "
						+ TEST_TABLE
						+ " (userId string, time string, action string, ref string, place string, profile_email string) "
						+ "ROW FORMAT DELIMITED " + "FIELDS TERMINATED BY ',' "
						+ "STORED AS TEXTFILE ");

		System.out.println(set.next());
	}

	@Test
	public void testSelectCount() throws Exception {
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery("select count(");
	}

	@Test
	public void testLoadDataIntoHiveFromHadoop() throws Exception {
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery(" load data inpath '" + data_path
				+ "' into table " + TEST_TABLE);
		System.out.println(set.next());
	}

	@Test
	public void testSelectWhereAction() throws Exception {
		String sql = "select count(1) as num from " + TEST_TABLE
				+ " where action=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "CREATE");
		ResultSet res = ps.executeQuery();
		while (res.next()) {
			int num = res.getInt("num");
			System.out.println(num);
		}
	}

	@Test
	public void testGetMetadata() throws Exception {
		HiveConf hiveConf = new HiveConf(SessionState.class);
		hiveConf.set("hive.metastore.uris", "thrift://127.0.0.1:10000");
		HiveMetaStoreClient client = new HiveMetaStoreClient(hiveConf);
		org.apache.hadoop.hive.metastore.api.Table t = client.getTable(
				"default", TEST_TABLE);

		System.out.println(t.getTableName());
	}
}
