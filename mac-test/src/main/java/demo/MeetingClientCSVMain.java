/**
 * 
 */
package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author zhefang
 * 
 */
public class MeetingClientCSVMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		HSSFWorkbook workBook = new HSSFWorkbook();
		File folder = new File(
				"C:\\Users\\zhefang\\Documents\\DA\\DA_Overall\\meetingClient");
		Map<String, Map<String, String>> outputMap = new HashMap<String, Map<String, String>>();
		readDataFromFile(folder.listFiles(), outputMap);
		writeDataIntoWorkBook(workBook, outputMap);
		File newFile = new File(
				"C:\\Users\\zhefang\\Documents\\DA\\DA_Overall\\meetingClient\\test.xls");
		if (!newFile.exists()) {
			newFile.createNewFile();
		}
		FileOutputStream fOut = new FileOutputStream(newFile);
		workBook.write(fOut);
		fOut.flush();
		fOut.close();
		System.out.println("xls file generated...");
	}

	@Profiled(tag = "failuresSeparatelyExample", logFailuresSeparately = true)
    public static void logFailuresSeparatelyExample(boolean shouldFail) throws Exception {
        Thread.sleep((long) (Math.random() * 1000L));
        if (shouldFail) {
            throw new Exception("Method threw exception");
        }
    }
	
	private static void readDataFromFile(File[] files,
			Map<String, Map<String, String>> outputMap) throws Exception {
		for (File file : files) {
			FileInputStream fis = new FileInputStream(file);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					fis));
			String tr = reader.readLine();
			String fileName = file.getName();
			if (fileName.indexOf(".") > 0) {
				fileName = fileName.substring(0, fileName.indexOf("."));
			}
			String[] trs = tr.split(",");
			Map<String, String> vals = new HashMap<String, String>();
			for (String td : trs) {
				String[] cols = td.split(":");
				vals.put(cols[0], cols[1]);
			}
			outputMap.put(fileName, vals);
		}

	}

	private static void writeDataIntoWorkBook(HSSFWorkbook workBook,
			Map<String, Map<String, String>> sheetData) {
		Iterator<String> it = sheetData.keySet().iterator();
		int sheetNo = 0;
		while (it.hasNext()) {
			String sheetName = it.next(); // day
			HSSFSheet sheet = workBook.createSheet();
			workBook.setSheetName(sheetNo, sheetName);
			sheetNo++;
			Map<String, String> data = sheetData.get(sheetName);
			Iterator<String> dataIt = data.keySet().iterator();
			HSSFRow row = null;
			HSSFCell cell1 = null;
			HSSFCell cell2 = null;
			for (int rowNo = 1; dataIt.hasNext(); rowNo++) {
				row = sheet.createRow(rowNo);
				String key = dataIt.next();
				cell1 = row.createCell(0);
				cell1.setCellValue(key);
				cell2 = row.createCell(1);
				cell2.setCellValue(data.get(key));
			}
		}
	}

	public static boolean createCsv(Map<String, String> qryData,
			String[][] columnName) throws Exception {
		return true;
	}
}
