/**
 * 
 */
package hadoop.tail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.util.LineReader;

import sun.io.ByteToCharUTF8;

/**
 * @author root
 * 
 */
public class TestAddFile {

	static public char makeChar(byte b1, byte b0) {
		return (char) ((b1 << 8) | (b0 & 0xff));
	}

	static public String makeStringFromBytes(byte[] bytes) {
		// if (bytes.length % 2 == 0) {
		int len = bytes.length / 2;
		char[] result = new char[len];
		int j = 0;
		for (int i = 0; i < bytes.length; i++) {
			if (i % 2 == 0) {
				char c = makeChar(bytes[i], bytes[i + 1]);
				result[j] = c;
				j++;
			}
		}
		return new String(result);

	}

	public static String getDefaultEncodingName() {
		String defaultEncoding = null;
		synchronized (TestAddFile.class) {
			if (defaultEncoding == null) {
				java.security.PrivilegedAction<String> pa = new sun.security.action.GetPropertyAction(
						"file.encoding");
				defaultEncoding = java.security.AccessController
						.doPrivileged(pa);
			}
		}
		return defaultEncoding;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		System.out.println(getDefaultEncodingName());
		ByteToCharUTF8 btcu = new ByteToCharUTF8();

		File infile = new File("/home/mac/a.txt");
		FileInputStream in = new FileInputStream(infile);
		LineReader r = new LineReader(in);
		Text result = new Text();
		r.readLine(result);

		System.out.println(btcu.getCharacterEncoding());
		long start = System.currentTimeMillis();
		for (int i = 0; i <1000000; i++) {
//			char[] tt = btcu.convertAll(result.getBytes());
//			String t = new String(tt);
			String t = new String(result.getBytes());
		}
		long end = System.currentTimeMillis();

		System.out.println(" cost " + (end - start));
		//
		// ByteToCharUTF8 btcu = new ByteToCharUTF8();
		// char[] aa = btcu.convertAll(result.getBytes());
		// System.out.println(new String(aa));
		// char[] cc = a.toCharArray();
		// byte[] b2 = new byte[cc.length * 2];
		// for (int i = 0; i < cc.length; i++) {
		// byte b = (byte) ((cc[i]) >> 8);
		// b2[2 * i] = b;
		// byte b1 = (byte) (cc[i] & 0xff);
		// b2[2 * i + 1] = b1;
		// }
		// char[] result = new char[b2.length / 2];
		// int j = 0;
		// for (int i = 0; i < b2.length; i++) {
		// if (i % 2 == 0) {
		// char c = makeChar(b2[i], b2[i + 1]);
		// result[j] = c;
		// j++;
		// }
		// }
		// System.out.println("result : " + new String(result));
	}

	// public static int stringToByte(String in, byte[] b) throws Exception {
	// if (b.length < in.length() / 2) {
	// throw new Exception("byte array too small");
	// }
	//
	// int j = 0;
	// StringBuffer buf = new StringBuffer(2);
	// for (int i = 0; i < in.length(); i++) {
	// buf.insert(0, in.charAt(i));
	// buf.insert(1, in.charAt(i + 1));
	// int t = Integer.parseInt(buf.toString(), 16);
	// System.out.println("byte hex value:" + t);
	// b[j] = (byte) t;
	// i++;
	// buf.delete(0, 2);
	// }
	//
	// return j;
	// }

	public static String byteToString(byte b) {
		byte high, low;
		byte maskHigh = (byte) 0xf0;
		byte maskLow = 0x0f;

		high = (byte) ((b & maskHigh) >> 4);
		low = (byte) (b & maskLow);

		StringBuffer buf = new StringBuffer();
		buf.append(findHex(high));
		buf.append(findHex(low));

		return buf.toString();
	}

	private static char findHex(byte b) {
		int t = new Byte(b).intValue();
		t = t < 0 ? t + 16 : t;

		if ((0 <= t) && (t <= 9)) {
			return (char) (t + '0');
		}

		return (char) (t - 10 + 'A');
	}

	public static void add() throws Exception {
		int i = 0;
		String serverAddress = "hdfs://10.224.203.97:9000";
		String remotePath = "/tail/test-" + System.currentTimeMillis();
		// TODO Auto-generated method stub
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", serverAddress);
		try {
			FileSystem fs = FileSystem.get(conf);
			Path remoteFile = new Path(remotePath + ".txt");
			FSDataOutputStream out = fs.create(remoteFile);
			while (true) {
				out.writeChars("Add" + " time " + " " + (i++)
						+ " ............... /n/r ");
				out.sync();
				Thread.sleep(1000);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void append() throws Exception {
		// /tail/test-1310618514234.txt
		int i = 0;
		String serverAddress = "hdfs://10.224.203.97:9000";
		String remotePath = "/tail/test-1.txt";
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", serverAddress);
		FileSystem fs = FileSystem.get(conf);
		Path remoteFile = new Path(remotePath);

		if (!fs.exists(remoteFile)) {
			FSDataOutputStream out1 = fs.create(remoteFile);
			out1.writeChars("Add" + " time " + " " + (i++)
					+ " ............... /n/r ");
			out1.close();
		}

		FSDataOutputStream out = fs.append(remoteFile);

		while (i < 1000000000) {
			out.writeChars(" new append ~~~~~~~~~~~~ " + i++);
			out.hflush();
			Thread.sleep(500);
		}
		out.close();
	}
}
