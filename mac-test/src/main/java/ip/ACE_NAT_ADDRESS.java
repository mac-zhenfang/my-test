package ip;

import java.net.InetAddress;

public class ACE_NAT_ADDRESS {

	public static void main(String[] args) throws Exception {
		String vip = "10.224.179.208";
		InetAddress vipAddr = InetAddress.getByName(vip);
		System.out.println(vipAddr.getCanonicalHostName());
	}
}
