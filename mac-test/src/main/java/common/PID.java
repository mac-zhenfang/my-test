package common;

import java.util.Iterator;
import java.util.Map;

public class PID {

	public static void main(String[] args) {
		Map<String, String> map = System.getenv();
		for(Iterator<String> iter = map.keySet().iterator();iter.hasNext();){
			String key = iter.next();
			System.out.println(" key " + key + " value " + map.get(key));
		}
		//Runtime.getRuntime().exec(command)
	}
}
