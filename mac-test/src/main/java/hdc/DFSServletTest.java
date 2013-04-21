/**
 * 
 */
package hdc;

import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class DFSServletTest {
	public static void main(String[] args) throws Exception {
		String path = "hdfs://173.39.170.162:9000/mac1/AAA";
		final FileSystem fs = FileSystem.get(URI.create(path),
				new Configuration());
		Path p = new Path(path);
		FSDataOutputStream out = null;

		for (int i = 0; i < 1; i++) {
			if (fs.exists(p)) {
				out = fs.append(p);
			} else {
				out = fs.create(p);
			}
			out.write("mac test".getBytes());
			System.out.println("OK ~~ " + i);
		}
		System.out.println("done~~");
	}
	
}
