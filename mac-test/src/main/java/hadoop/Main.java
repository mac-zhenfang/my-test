/**
 * 
 */
package hadoop;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author root
 * 
 */
public class Main {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\projects\\logs\\hive\\test.txt");
		file.createNewFile();
		FileOutputStream fos = new FileOutputStream(file);
		int i = 0;
		while (i++ < 10000) {
			fos.write((i + ",test_data_" + i + "\r\n").getBytes());
		}
		fos.close();
	}
}
