/**
 * 
 */
package mongodb;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author MacF
 * 
 */
public class Basic {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		DBAddress d1 = new DBAddress("10.224.178.104:27017");
		DBAddress d2 = new DBAddress("10.224.178.104:27018");
		DBAddress d3 = new DBAddress("10.224.178.207:27017");
		Mongo m = new Mongo(d1, d2);
		System.out.println(m.getAllAddress());
		DB db = m.getDB("mac");
		// Set<String> colls = db.getCollectionNames();
		//
		// for (String s : colls) {
		// DBCollection coll = db.getCollection(s);
		// DBCursor cursor = coll.find();
		// while(cursor.hasNext()){
		// DBObject obj = cursor.next();
		// System.out.println(obj.toString());
		// }
		// }
		GridFS myFS = new GridFS(db);
		// GridFSInputFile fs = myFS.createFile(new File("F://2.jpg"));
		// fs.put("test1", "test");
		// fs.put("test2", "test");
		// fs.put("test3", "test");
		// fs.setFilename("mac test file");
		// fs.save();
		List<GridFSDBFile> gfsbList = myFS.find("mac test file");
		for (GridFSDBFile gfsb : gfsbList) {
			System.out.println(" file >>>> " + gfsb.toString());
			InputStream fi = gfsb.getInputStream();
			System.out.println(" file >>>> " + fi.available());
		}
		DBCursor fileCursor = myFS.getFileList();

		while (fileCursor.hasNext()) {
			DBObject obj = fileCursor.next();

			System.out.println(" file >>>> " + obj.toString());
		}
	}

	@Test
	public void testCollectionSharding_Insert() throws Exception {
		List<ServerAddress> setList = new ArrayList<ServerAddress>();
		setList.add(new ServerAddress("10.224.178.104", 27019));
		// setList.add(new ServerAddress("10.224.178.104", 27017));
		Mongo mongo = new Mongo(setList);
		DB db = mongo.getDB("user");
		DBCollection users = db.getCollection("user");
		for (int i = 0; i < 1000; i++) {
			BasicDBObject user = new BasicDBObject();
			user.put("userid", i);
			user.put("user", "mac fang");
			user.put("user", "mac fang");
			users.insert(user);
			System.out.println(" >>> complete" + i);
		}

	}

	@Test
	public void testReadCollectionSharding_Read_Shard1_27017() throws Exception {
		List<ServerAddress> setList = new ArrayList<ServerAddress>();
		setList.add(new ServerAddress("10.224.178.104", 27017));
		Mongo mongo = new Mongo(setList);
		DB db = mongo.getDB("test");
		DBCollection users = db.getCollection("user");
		System.out.println(users.getCount());
	}

	@Test
	public void testReadCollectionSharding_Read_Shard1_29017() throws Exception {
		List<ServerAddress> setList = new ArrayList<ServerAddress>();
		setList.add(new ServerAddress("10.224.178.104", 29017));
		Mongo mongo = new Mongo(setList);
		DB db = mongo.getDB("test");
		DBCollection users = db.getCollection("user");
		System.out.println(users.getCount());
	}

	@Test
	public void testReadCollectionSharding_Read_Shard1_Total() throws Exception {
		List<ServerAddress> setList = new ArrayList<ServerAddress>();
		setList.add(new ServerAddress("10.224.178.104", 27019));
		Mongo mongo = new Mongo(setList);
		DB db = mongo.getDB("mp");
		DBCollection users = db.getCollection("user");

		System.out.println(users.getCount());
	}

	@Test
	public void testReadCollectionSharding_Read_Shards_Find_one()
			throws Exception {
		List<ServerAddress> setList = new ArrayList<ServerAddress>();
		setList.add(new ServerAddress("10.224.178.104", 27019));
		Mongo mongo = new Mongo(setList);
		DB db = mongo.getDB("test");
		DBCollection users = db.getCollection("user");

		System.out.println(users.findOne());
	}

	@Test
	public void testReadCollectionSharding_Read_Shards_Find_Specific_one()
			throws Exception {
		List<ServerAddress> setList = new ArrayList<ServerAddress>();
		setList.add(new ServerAddress("10.224.178.104", 27019));
		Mongo mongo = new Mongo(setList);
		DB db = mongo.getDB("test");
		DBCollection users = db.getCollection("user");
		BasicDBObject obj = new BasicDBObject("userid", 194510);
		System.out.println(users.findOne(obj));
	}

	@Test
	public void testReadCollectionSharding_Read_Shards_Find_In_Range()
			throws Exception {
		List<ServerAddress> setList = new ArrayList<ServerAddress>();
		setList.add(new ServerAddress("10.224.178.104", 27019));
		Mongo mongo = new Mongo(setList);
		DB db = mongo.getDB("test");
		DBCollection users = db.getCollection("user");
		BasicDBObject obj = new BasicDBObject("userid", new BasicDBObject(
				"$lte", 5000000));
		System.out.println(users.findOne(obj));

		DBCursor cur = users.find(obj);

		while (cur.hasNext()) {
			DBObject obj2 = cur.next();

			System.out.println(" file >>>> " + obj2.toString());
		}
	}

	@Test
	public void testReplicationSet() throws Exception {
		List<ServerAddress> setList = new ArrayList<ServerAddress>();

		// setList.add(new ServerAddress("10.224.178.104", 27017));
		setList.add(new ServerAddress("10.224.178.104", 27018));
		// setList.add(new ServerAddress("10.224.178.207", 27017));
		Mongo mongo = new Mongo(setList);

		DB db = mongo.getDB("mac");

		GridFS myFS = new GridFS(db);

		GridFSInputFile fs = myFS.createFile(new File("F://2.jpg"));
		fs.put("test1", "test");
		fs.put("test2", "test");
		fs.put("test3", "test");

		fs.setFilename("mac test file");
		fs.save();

		List<GridFSDBFile> gfsbList = myFS.find("mac test file");
		for (GridFSDBFile gfsb : gfsbList) {
			System.out.println(" file >>>> " + gfsb.toString());
			InputStream fi = gfsb.getInputStream();
			System.out.println(" file >>>> " + fi.available());
		}
	}

	@Test
	public void testSharding() throws Exception {
		String dbStr = "dms3";
		List<ServerAddress> setList = new ArrayList<ServerAddress>();
		//setList.add(new ServerAddress("10.224.178.104", 29017));
		//setList.add(new ServerAddress("10.224.178.104", 27017));
		setList.add(new ServerAddress("10.224.178.104", 27019));
		Mongo mongo = new Mongo(setList);
		DB db = mongo.getDB(dbStr);

		GridFS myFS = new GridFS(db);
//		for (int j = 0; j < 500; j++) {
//			long start = System.currentTimeMillis();
//			GridFSInputFile fs = myFS.createFile(new File("F://WAPI2.0_Cache_Distributed Cache Service_0512.doc"));
//			fs.put("test1", "test");
//			fs.put("test2", "test");
//			fs.put("test3", "test");
//			fs.put("files_id", j);
//			fs.setFilename(""+dbStr+" test");
//			fs.save();
//			long end = System.currentTimeMillis();
//			System.out.println(" >>> compelete [cost =" + (end - start)
//					+ "=] => " + fs.get("files_id"));
//		}
		List<GridFSDBFile> gfsbList = myFS.find(""+dbStr+" test");
		System.out.println(gfsbList.size());
		// for(GridFSDBFile file : gfsbList){
		// System.out.println(file.toString());
		// }
	}

	@Test
	public void testMapReduce() throws Exception {

	}
}
