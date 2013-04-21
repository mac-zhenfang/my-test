/**
 * 
 */
package mongodb;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MacF
 *
 */
public class Tracer {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		List<ServerAddress> setList = new ArrayList<ServerAddress>();
		setList.add(new ServerAddress("10.224.178.104", 27019));
		Mongo mongo = new Mongo(setList);
		DB db = mongo.getDB("logs");
		DBCollection webex11 = db.getCollection("webex11");
		for (int i = 0; i < 1000; i++) {
			BasicDBObject log = new BasicDBObject();
			log.put("traceid", i);
			log.put("user", "mac fang");
			webex11.insert(log);
			System.out.println(" >>> complete" + i);
		}
		System.out.println("Count -> " + webex11.getCount());
	}

}
