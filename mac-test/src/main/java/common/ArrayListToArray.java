package common;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>(10);
		arrayList.add("test");
		arrayList.add("test");
		arrayList.add("test");
		arrayList.add("test");
		
		String[] test = arrayList.toArray(new String[] { "" });

		System.out.println(test.length);
	}

}
