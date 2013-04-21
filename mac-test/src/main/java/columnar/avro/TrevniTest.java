/**
 * 
 */
package columnar.avro;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import org.apache.trevni.ColumnFileMetaData;
import org.apache.trevni.ColumnFileReader;
import org.apache.trevni.ColumnFileWriter;
import org.apache.trevni.ColumnMetaData;
import org.apache.trevni.ValueType;

import au.com.bytecode.opencsv.CSVReader;

/**
 * @author zhefang
 * 
 */
public class TrevniTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CSVToTrevni("c:\\test_csv.csv", "c:\\test_tevni_snappy");
		TreveniToCSV("c:\\test_tevni_snappy", "");
	}

	private static String codec = "snappy";
	private static String checksum = "crc32";

	private static ColumnFileMetaData createFileMeta() {
		return new ColumnFileMetaData().setCodec(codec).setChecksum(checksum);
	}

	public static void TreveniToCSV(String trevniFilename, String csvFilename)
			throws Exception {
		// File trevniFile = new File(trevniFilename);
		// ColumnFileReader trevniReader = new ColumnFileReader(trevniFile);
		// System.out.println(trevniReader.getColumnCount());
		// System.out.println(trevniReader.getRowCount());
		// ColumnValues<String> values = trevniReader.getValues("name");
		// for (String value : values) {
		// System.out.println(value);
		// }
		// Memory test to ByteBuffer
		long inusemem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		ByteBuffer b = ByteBuffer.allocate(65536);
		String test = "adsasdaaaaaaaaaaafsafsafa";
		for (int i = 0; i < 1000; i++) {
			b.put(test.getBytes());
		}
		List<byte[]> stores = new ArrayList<byte[]>();
		
		for (int j = 0; j < 10; j++) {
			stores.add(b.array());
		}
		System.out.println(b.array().length + " mem: " + inusemem);
		File f = new File("C:\\test1");
		f.createNewFile();
		FileOutputStream fos = new FileOutputStream(f);
		for (byte[] t : stores) {
			fos.write(t);
		}
		fos.close();
		
		
		
		
		
		System.gc();
		System.gc();
		inusemem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		Thread.currentThread().sleep(5000);
		
		
		System.out.println(b.array().length + " mem: " + inusemem);
		
		
		
	}

	public static long CSVToTrevni(String csvFilename, String trevniFilename)
			throws Exception {
		File trevniFile = new File(trevniFilename);
		trevniFile.delete();

		// Get first line of table
		CSVReader reader = new CSVReader(new FileReader(csvFilename));
		String[] firstLine = reader.readNext();

		// Use first line of table to initialize Trevni file writer
		// we can easily convert to hive meta
		ColumnMetaData[] cols;
		cols = new ColumnMetaData[firstLine.length];
		for (int i = 0; i < firstLine.length; i++) {
			cols[i] = new ColumnMetaData(firstLine[i], ValueType.STRING);
		}
		ColumnFileWriter out = new ColumnFileWriter(createFileMeta(), cols);
		out.writeRow(firstLine);

		// Iterate through the CSV and write each row to Trevni file
		String[] nextLine;
		int k = 0;
		while ((nextLine = reader.readNext()) != null) {
			out.writeRow(nextLine);
			if (k % 2 == 0) {
				System.out.println(" --- pretend to flush --- " + k);
				out.writeTo(trevniFile);
			}
			k++;
		}
		out.writeTo(trevniFile);
		// Count the number of rows written
		ColumnFileReader in = new ColumnFileReader(trevniFile);
		return in.getRowCount();
	}
}
