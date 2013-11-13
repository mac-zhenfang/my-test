/**
 * 
 */
package hive;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;


/**
 * @author root
 * 
 */
public class LogGenerator {

	/**
	 * @param args
	 */
	static String SEPERATOR = ",";
	static String[] fromWhere = new String[] { "CA", "DA", "AA", "BA", "BB",
			"BC", "BB", "BD", "BE", "BF", "BG", "BH" };
	static String[] actions = new String[] { "GET", "SET", "DELETE", "LIST",
			"REMOVE", "CREATE", "START", "END", "STOP", "HALT" };
	static String[] profilEmail = new String[] { "a@a.com", "a@b.com",
			"a@c.com", "a@d.com", "a@e.com", "a@f.com", "a@g.com", "a@h.com",
			"a@i.com", "a@j.com" };

	public static void main(String[] args) throws Exception {
		 createHiveLogLocal();
		//createHiveLogHadoop();
		// Date current = new Date(System.currentTimeMillis());
		// System.out.println("2011-09-06 " + current.getHours() + ":"
		// + current.getMinutes() + ":" + current.getSeconds());
	}

	public static void createHiveLogLocal() throws Exception {
		// who, when, what, fromwhere, where, profile-email
		int i = 0;
		File f = new File("C:/hive/");
		if (!f.exists())
			f.mkdirs();
		File ff = new File(f, System.currentTimeMillis() + ".log");
		ff.createNewFile();
		FileOutputStream fos = new FileOutputStream(ff);
		while (i < 100000000) {
			String str = getStr(i, "");
			str = str + "\n";
			fos.write(str.getBytes());
			i++;
		}
		fos.close();
	}

	public static void createHiveLogHadoop() throws Exception {
		String serverAddress = "hdfs://173.39.170.253:9000";
		String remotePath = "/hive";
		Configuration conf = new Configuration();
		conf.set("fs.default.name", serverAddress);
		try {
			FileSystem fs = FileSystem.get(conf);
			if (fs.exists(new Path("/hive"))) {
				fs.delete(new Path("/hive"), true);
			}
			for (int d = 1; d < 30; d++) {
				for (int i = 1; i <= 96; i++) {
					String day = d < 10 ? "0" + d : "" + d;

					Path remoteFile = new Path(remotePath + "/2011-09-" + day
							+ "/" + i);
					FSDataOutputStream out = fs.create(remoteFile);
					int j = 0;
					while (j < 100000) {
						out.writeUTF(getStr(j, System.currentTimeMillis() + ""));
						j++;
					}
					out.close();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getStr(int i, String date) {
		String str = UUID.randomUUID().toString() + SEPERATOR + date
				+ SEPERATOR + actions[i % actions.length] + SEPERATOR
				+ fromWhere[(i + 1) % fromWhere.length] + SEPERATOR
				+ fromWhere[i % fromWhere.length] + SEPERATOR
				+ profilEmail[i % profilEmail.length] + "\n";
		return str;
	}
}
