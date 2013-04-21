package hadoop.security;

import java.security.PrivilegedExceptionAction;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.permission.FsAction;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.security.UserGroupInformation;
import org.junit.Test;

public class FileTest {

	@Test
	public void testListWithPermission() throws Exception {
		final Configuration conf = new Configuration();
		conf.set("fs.default.name", "hdfs://10.224.203.97:9000");

		UserGroupInformation ugi = UserGroupInformation.createRemoteUser("dms");
		ugi.doAs(new PrivilegedExceptionAction<Void>() {

			@Override
			public Void run() throws Exception {
				final FileSystem fs = FileSystem.get(conf);
				Path path = new Path("/mac");
				fs.listStatus(path);
				// fs.create(new Path("/dms-logs/temp2"));
				return null;
			}
		});
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		conf.set("fs.default.name", "hdfs://mac-desktop.local:9000");
		final FileSystem fs = FileSystem.get(conf);
		FsPermission permission = new FsPermission(FsAction.ALL, FsAction.ALL,
				FsAction.ALL);
		Path path = new Path("/data");
		Path file = new Path("/data/log1");
		FSDataOutputStream out = fs.create(fs, file, permission);
		int i = 0;
		while (i++ < 100000000) {
			out.writeUTF("test"+i+","+i+","+System.currentTimeMillis()+"\n");
		}
		out.close();
		fs.close();
		// UserGroupInformation ugi =
		// UserGroupInformation.createRemoteUser("all");
		// ugi.doAs(new PrivilegedExceptionAction<Void>() {
		// @Override
		// public Void run() throws Exception {
		// FsPermission permission = new FsPermission(FsAction.ALL,
		// FsAction.READ_EXECUTE, FsAction.NONE);
		// Path path = new Path("/other");
		// fs.mkdirs(path, permission);
		// fs.listStatus(path);
		// fs.setOwner(path, "other", "wbx11");
		//
		// Path file = new Path("/other/log1");
		//
		// FSDataOutputStream out = fs.create(fs, file, permission);
		// fs.setOwner(file, "dms", "wbx11");
		// int i = 0;
		// while (i++ < 100000) {
		// out.writeUTF("test \n");
		// }
		// out.close();
		// fs.close();
		// return null;
		// }
		// });

	}
}