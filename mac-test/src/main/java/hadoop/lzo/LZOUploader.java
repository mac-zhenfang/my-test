/**
 * 
 */
package hadoop.lzo;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * @author root
 *
 */
public class LZOUploader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String serverAddress = "hdfs://10.224.203.97:9000";
		String remotePath = "/test";
		// TODO Auto-generated method stub
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", serverAddress);
		try {
			FileSystem fs = FileSystem.get(conf);
			Path remoteFile = new Path(remotePath + ".lzo");
			FileStatus fsStatus = fs.getFileStatus(remoteFile);
			fsStatus.
			FSDataOutputStream out = fs.create(remoteFile);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
