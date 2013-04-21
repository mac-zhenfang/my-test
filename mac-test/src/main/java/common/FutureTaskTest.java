/**
 * 
 */
package common;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @author MacF
 * FutureTask need to be run in a thread
 */
public class FutureTaskTest {
	public static void main(String[] args) throws Exception {
		FutureTask work = new FutureTask(new Callable() {
			public Object call() throws Exception {
				return null;
			}
		});

		// add by Truman at 2010-9-9.
		Thread t = new Thread(work);
		t.setDaemon(true);
		t.start();
		
		work.get(1000, TimeUnit.MILLISECONDS);
		System.out.println(" ~~~~~~~~~~ ");
	}
}
