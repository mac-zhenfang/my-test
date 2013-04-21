/**
 * 
 */
package realtime.hadoop;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

/**
 * @author root
 * 
 */
public class ConcurrentFileUploader implements Tool {

	/**
	 * @param args
	 * @throws Exception
	 */
	private Configuration conf = new Configuration();

	private final FileSystem fs;
	private final StringBuffer str_10k = new StringBuffer();
	private static int how_many_k = 10;
	private static String basic_100_bytes = "We could provide any support to Scribe testing task, including integration environment setup and others from DMS side";

	public ConcurrentFileUploader() throws IOException {
		fs = FileSystem.get(URI.create("hdfs://10.224.203.97:9000/"), conf);
		for (int i = 0; i < how_many_k * 10; i++) {
			str_10k.append(basic_100_bytes);
		}
	}

	public static void main(String[] args) throws Exception {
		ToolRunner.run(new ConcurrentFileUploader(), args);
		// System.exit(0);
	}

	public void setConf(Configuration conf) {
		Configuration conf2 = null;
		if (null == conf) {
			conf2 = new Configuration(conf);
			this.conf = conf2;
		}

	}

	public Configuration getConf() {
		return this.conf;
	}

	public int run(String[] args) throws Exception {
		try {
			final Path concurrent_test_folder = new Path("/concurrent");
			if (!fs.exists(concurrent_test_folder)) {
				fs.mkdirs(concurrent_test_folder);
			}
			ExecutorService pool_20 = Executors.newScheduledThreadPool(2);
			final int loop = 100;
			int cur = 0;
			final AtomicInteger has = new AtomicInteger();
			while (cur++ < loop) {
				pool_20.submit(new Runnable() {

					public void run() {
						try {
							FSDataOutputStream out = fs.create(new Path(
									concurrent_test_folder, "test-file-"
											+ System.currentTimeMillis()));
							out.writeBytes(str_10k.toString());
							
							out.hflush();
//							out.close();
							System.out.println(" finish flush : "
									+ has.getAndIncrement());
							if (has.get() == loop) {
								System.exit(0);
							}
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				});
			}

		} finally {

		}
		return 0;
	}
}
