package hadoop.lzo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class LzopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		int lzoBufferSize = 256 * 1024;
		File pdfFile = new File("/home/mac", "nfscookbook.pdf");
		File lzoOutFile = new File("/home/mac", "rink-10.lzo");
		if (lzoOutFile.exists()) {
			lzoOutFile.delete();
		}
		BufferedReader textBr = new BufferedReader(new InputStreamReader(
				new FileInputStream(pdfFile.getAbsolutePath())));
		LzoCompressor.CompressionStrategy strategy = LzoCompressor.CompressionStrategy.LZO1X_1;
		LzoCompressor lzoCompressor = new LzoCompressor(strategy, lzoBufferSize);
		LzopOutputStream os = new LzopOutputStream(new FileOutputStream(
				lzoOutFile), lzoCompressor, lzoBufferSize, strategy);
		String textLine;
		while ((textLine = textBr.readLine()) != null) {
			textLine += "\n";
			byte[] bytes = textLine.getBytes();
			os.write(bytes, 0, bytes.length);
		}
		textBr.close();
		os.close();
		
		// read
		LzoDecompressor.CompressionStrategy decomstrategy = LzoDecompressor.CompressionStrategy.LZO1X_SAFE;
		LzoDecompressor lzoDeCompressor = new LzoDecompressor(decomstrategy, lzoBufferSize);
		LzopInputStream lis = new LzopInputStream(new FileInputStream(lzoOutFile), lzoDeCompressor, lzoBufferSize);
		
		BufferedReader lzoBr = new BufferedReader(new InputStreamReader(lis));
		
//		System.out.pritln();
	}

}
