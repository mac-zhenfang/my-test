/**
 * 
 */
package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

/**
 * @author zhefang
 * 
 */
public class ProcessTest {

	@Test
	public void testRuntime() throws Exception {
		readConsoleRuntime("cmd.exe   /c dir", true);
	}

	public static String readConsoleProcessBuilder(String cmd,
			boolean isPrettify) throws IOException {
		ExecutorService executors = Executors.newFixedThreadPool(10);
		LinkedList<String> pArgs = new LinkedList<String>();
		Process process = new ProcessBuilder(pArgs).start();
		try {
			process.getInputStream();
		} catch (InterruptedException e) {
			throw new IOException(e);
		}
	}

	public static String readConsoleRuntime(String cmd, Boolean isPrettify)
			throws IOException {
		StringBuffer cmdout = new StringBuffer();
		System.out.println("command execute: " + cmd);
		Process process = Runtime.getRuntime().exec(cmd); // run system command

		InputStream fis = process.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		if (isPrettify == null || isPrettify) {
			while ((line = br.readLine()) != null) {
				cmdout.append(line);
			}
		} else {
			while ((line = br.readLine()) != null) {
				cmdout.append(line)
						.append(System.getProperty("line.separator"));
			}
		}
		fis.close();
		System.out.println("the result：\n" + cmdout.toString());
		return cmdout.toString().trim();
	}
}
