/**
 * 
 */
package hadoop.mr;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.MapFile;
import org.apache.hadoop.io.Text;

/**
 * @author root
 * 
 */
public class CacheFileReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		String cacheFileAddr = "/home/mac/skip/simple/cache";
		String input = "1";
		MapFile.Reader cacheReader = new MapFile.Reader(FileSystem.get(conf),
				cacheFileAddr, conf);
		Text fileNameKey = new Text(input);
		LongWritable offset = new LongWritable();
		cacheReader.get(fileNameKey, offset);
		System.out.println("Key: " + input + " Offset : " + offset.get());
		cacheReader.close();
	}

}
