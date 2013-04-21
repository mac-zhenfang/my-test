package columnar.avro;

import java.io.FileReader;

import au.com.bytecode.opencsv.CSVReader;

public class DremelFileTest {

	/**
	 * @param args
	 * 
//	 * CSV to Dremel For CSV is easy, the r=0, d=0, but each r=0 needs a row count
 * E.g, csv:
 * 			mac, 31, male, ca
 * 			joe, 31, male, us
 * 			Merry, 27, female, ch
 * 			Jimmy, 30, male, de
 * 	 	to dremel will be:
 * 		Name (file name)
 * 				mac, 0, 0, 1
 * 				joe, 0, 0, 2
 * 				Merry, 0, 0, 3
 * 				Jimmy, 0, 0, 4
 * 		Age (file name)
 * 				31, 0, 0, 1
 * 				31, 0, 0, 2
 * 				27, 0, 0, 3
 * 				30, 0, 0, 4
 * 		Genda (file name)
 * 				male, 0, 0, 1
 * 				male, 0, 0, 2
 *				female, 0, 0, 3
 *				male, 0, 0, 4
 *		nationality (file name)
 *				ca, 0, 0, 1
 *				us, 0, 0, 2
 *				ch, 0, 0, 3
 *				de, 0, 0, 4
 *		when use SQL: select sum(name) where genda = 'male'
 *		if genda is indexed, it will be sorted by ACSII, 
 *		
 *		
 *		
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CSVReader reader = new CSVReader(new FileReader("c:\\test_csv.csv"));
		String[] firstLine = reader.readNext();
		for(String col : firstLine){
			// create file for each col
			
		}
	}
	
	public static void createEachColDremelFile(String col) {
		
	}
	
}

class DremelFileWriter {
	
}