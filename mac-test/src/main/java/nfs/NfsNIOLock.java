package nfs;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

public class NfsNIOLock {
	private static final String STORAGE_FILE_LOCK = "in_use.lock";

	public static void main(String[] args) throws Exception {
		File lockF = new File("/spare/41/mac", STORAGE_FILE_LOCK);
		lockF.deleteOnExit();
		RandomAccessFile file = new RandomAccessFile(lockF, "rws");
		FileLock res = file.getChannel().tryLock(0L, 1L, false);
		System.out.println(res.size());
	}
}
