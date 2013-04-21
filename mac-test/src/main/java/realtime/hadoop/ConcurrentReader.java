/**
 * 
 */
package realtime.hadoop;

import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * @author root
 * 
 */
public class ConcurrentReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(
				URI.create("hdfs://10.224.203.97:9000/"), conf);
		Path p = new Path("/concurrent/test-file-1308131045248");
		FSDataInputStream fsdis = fs.open(p);
		System.out.println(fsdis.readLine());

	}

}
