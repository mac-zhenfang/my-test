package common;

import java.io.UnsupportedEncodingException;

public class Test {
	
	public static void main(String [] args) throws UnsupportedEncodingException{
		String aa = "test";
		byte [] bts = aa.getBytes("utf-8");
		for (byte t : bts)
			System.out.println(t);
	}
}
