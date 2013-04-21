/**
 * 
 */
package hadoop.lzo;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author root
 * 
 */
public class LogCreator {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String ori = "{\"le\":\"LoggingFilte\",\"pid\":\"home\",\"mid\":\"home\",\"oid\":\"\",\"rid\":\"51254FBA99F3C85051C193176D329488\",\"ts\":\"1303712608492\",\"ut\":\"\",\"cip\":\"10.224.65.47\",\"url\":\"http://eleven.webex.com:8080/collabs/home\",\"rurl\":\"http://eleven.webex.com:8080/collabs/\",\"fwd\":\"\",\"ck\":\"4\",\"js\":true,\"ba\":\"Firefox\",\"aut\":\"\",\"oi\":\"OD5XMSLX0YEYM1SCEPK86UVWSQ-17\",\"uid\":\"UC5GE01QX78HEG5BK7VBKW507T-17\",\"email\":\"webex11_user5@11.webex.com\",\"mi\":\"collab0101\",\"prefl\":\"en\",\"prefc\":\"US\",\"tz\":\"4\"}";

		// File testFile = new File("/home/mac", "test.log");
		// if (!testFile.exists()) {
		// testFile.createNewFile();
		// FileOutputStream fos = new FileOutputStream(testFile);
		// while (testFile.length() < 200 * 1000 * 1000) {
		// fos.write(ori.getBytes());
		// }
		// fos.close();
		// }

		File lzoOutFile = new File("/home/mac", "testlog"
				+ new LzopCodec().getDefaultExtension());

		int lzoBufferSize = 256 * 1024;
		LzoCompressor.CompressionStrategy strategy = LzoCompressor.CompressionStrategy.LZO1X_1;
		LzoCompressor lzoCompressor = new LzoCompressor(strategy, lzoBufferSize);
		LzopOutputStream lzoOut = new LzopOutputStream(new FileOutputStream(
				lzoOutFile.getAbsolutePath()), lzoCompressor, lzoBufferSize,
				strategy);
		while (lzoOutFile.length() < 200 * 1000 * 1000) {
			byte[] bytes = ori.getBytes();
			lzoOut.write(bytes, 0, bytes.length);
		}
		lzoOut.close();

	}

}
