/**
 * 
 */
package classloader;

import java.util.Arrays;

/**
 * @author root
 * 
 */
public class MainTestList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] test = new long[] { 15, 30, 45, 60, 75 };
		System.out.println((Math.abs(Arrays.binarySearch(test, 64)) - 1));
	}

}
