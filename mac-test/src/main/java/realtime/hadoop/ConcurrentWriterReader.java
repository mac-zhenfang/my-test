/**
 * 
 */
package realtime.hadoop;

import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * @author root
 * 
 */
public class ConcurrentWriterReader {
	private static int how_many_k = 10;
	private static String basic_100_bytes = "We could provide any support to Scribe testing task, including integration environment setup and others from DMS side";
	private final static StringBuffer str_10k = new StringBuffer();

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		final FileSystem fs = FileSystem.get(
				URI.create("hdfs://10.224.203.97:9000/"), new Configuration());
		final Path concurrent_test_folder = new Path("/concurrent");
		if (!fs.exists(concurrent_test_folder)) {
			fs.mkdirs(concurrent_test_folder);
		}
		final Path readPath = new Path(concurrent_test_folder, "test-file-"
				+ System.currentTimeMillis());
		Thread t_read = new Thread(new Runnable() {

			public void run() {
				FSDataInputStream fsdis = null;
				try {
					while (true) {
						Thread.currentThread().sleep(1000);
						System.out.println(" ----- start to read ----- ");
						fsdis = fs.open(readPath);
						System.out.println(" read what: " + fsdis.readLine());
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (null != fsdis)
						try {
							fsdis.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}

			}
		}) {
		};
		t_read.start();
		for (int i = 0; i < how_many_k * 10; i++) {
			str_10k.append(basic_100_bytes);
		}
		FSDataOutputStream out = fs.create(readPath);
		System.out.println(fs.exists(readPath));
		out.writeBytes(str_10k.toString() + "/r/n");
		out.hflush();
		out.close();
		out = fs.append(readPath);
		for (int i = 0; i < 100000; i++) {
			if (i % 10000 == 0) {
				System.out.println(" ----- has write to read ----- " + i);
			}
			out.writeBytes(str_10k.toString() + "/r/n");
			out.hflush();
		}

	}
}
