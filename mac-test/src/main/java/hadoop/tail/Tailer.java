/**
 * 
 */
package hadoop.tail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.compress.CompressionCodec;
import org.apache.hadoop.io.compress.CompressionCodecFactory;
import org.apache.hadoop.io.compress.CompressionInputStream;
import org.apache.hadoop.util.LineReader;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

/**
 * The tail actualy is a tool of 'More' and a tool of 'Tail' 1. 'More': It
 * starts from the position of '0' and tail the log every BULK_TAIL_SIZE 2.
 * 'Tail': The file is incremental, It starts from the end of the file and tail
 * till the end of the file or a bulk size
 * 
 * @author Macf
 * 
 */
public class Tailer extends Configured implements Tool {

	private long position;

	private LineReader lineReader;

	private static int BULK_TAIL_SIZE = 1024;

	/**
	 * @param args
	 */
	public Tailer(Configuration conf) {
		super(conf);
	}

	private void more(String src) {

	}

	private void tail(String src) {
		Path file = new Path(src);

		try {
			FileSystem srcFs = file.getFileSystem(getConf());
			FileStatus fileStatus = srcFs.getFileStatus(file);

			if (fileStatus.isDirectory()) {
				throw new IOException("Source must be a file.");
			}
			boolean firstTimeRead = true;
			long startOffset = 0;
			
			do {
				long fileSize = fileStatus.getLen();
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				// if it is tail, it start from the end of the file.
				if (firstTimeRead) {
					startOffset = fileSize;
				}
				// TEST purpose
				startOffset  = startOffset - BULK_TAIL_SIZE;

				long len = (fileSize - position > BULK_TAIL_SIZE) ? BULK_TAIL_SIZE
						: fileSize - position;

				setCurrentPosition(startOffset);

				FSDataInputStream in = srcFs.open(file);

				// read the file.
				try {
					in.seek(startOffset);
					// check if it is a compressed one
					CompressionCodecFactory compressionCodecs = new CompressionCodecFactory(
							getConf());
					final CompressionCodec codec = compressionCodecs
							.getCodec(file);
					if (codec != null) {

						CompressionInputStream cin = codec
								.createInputStream(in);
						// FIXME
						IOUtils.copyBytes(cin, baos, (int)len);
					} else {
						IOUtils.copyBytes(in, baos, (int)len);
					}
					System.out.println("Test " + new String(baos.toByteArray()));
					startOffset = in.getPos();
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						break;
					}
				} finally {
					in.close();
				}

			} while (true);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void setCurrentPosition(long pos) {
		this.position = pos;
	}

	public int run(String[] args) throws Exception {
		String src = "/tail/test-1.txt";
		tail(src);
		return 0;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Configuration conf = new Configuration();
		conf.set("fs.default.name", "10.224.203.97:9000");
		Tailer tailer = new Tailer(conf);
		ToolRunner.run(tailer, args);
	}

}
