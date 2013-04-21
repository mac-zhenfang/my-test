/**
 * 
 */
package hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Before;
import org.junit.Test;

/**
 * @author mac
 * 
 */
public class TestHadoopMiniCluster {

	static MiniDFSCluster cluster;

	@Before
	public void setup() throws Exception {
		if (null != cluster) {
			Configuration conf = new Configuration();
			cluster = new MiniDFSCluster(conf, 2, true, null);
		}
	}

	@Test
	public void testWrite() throws Exception {
		System.out.println("~~~ 1 ~~~");
		
		FileSystem fs = cluster.getFileSystem();
		FSDataOutputStream fdos = fs.create(new Path("/mac/test"));
		fdos.writeUTF("test test");
		fdos.flush();
		fdos.close();
	}

	@Test
	public void testRead() throws Exception {
		FileSystem fs = cluster.getFileSystem();
		FSDataInputStream fsdis = fs.open(new Path("/mac/test"));
		System.out.println(" Test: " + fsdis.readUTF());

		fsdis.close();
	}
	
	@Test
	public void testLocalFileSystem() throws Exception {
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(conf);
		FSDataOutputStream fdos = fs.create(new Path("/mac/test"));
		fdos.writeUTF("test test");
		fdos.flush();
		fdos.close();
	}
	
}
