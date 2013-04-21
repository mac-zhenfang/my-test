/**
 * 
 */
package demo;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

/**
 * @author zhefang
 * 
 */
public class DataAggregator implements Tool {
	List<Member> memberList = new ArrayList<Member>();
	List<String> actions = new ArrayList<String>();
	int lineNumber;
	
	public static void main(String[] args) {
		int ret = 0;
		try {
			DataAggregator da = new DataAggregator();
			ret = ToolRunner.run(da, args);
		} catch (Exception e) {

		}
	}

	@Override
	public void setConf(Configuration conf) {
		// TODO Auto-generated method stub

	}

	@Override
	public Configuration getConf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int run(String[] args) throws Exception {

		if (args.length == 2 && args[0].equals("-lines")) {
			lineNumber = Integer.parseInt(args[1]);
		} else {
			lineNumber = 1000000;
		}
		InputStream is = System.in;
		byte[] b = new byte[1024];
		String readStr = null;
		int haveread;
		while (true) {

			if (memberList.size() == 0) {
				System.out
						.println("please enter name:geo, seperate each with comma : ");
				haveread = is.read(b);
				readStr = new String(b);
				if (null != readStr) {
					try {
						String[] strs = readStr.split(",");
						for (String str : strs) {
							String[] memLst = str.split(":");
							memberList.add(new Member(memLst[0], memLst[1]));
						}
					} catch (Exception e) {
						System.out
								.println("input error, the standard is: mac:hz,tom:sh,joe:zj");
					}
				}
			} else if (actions.size() == 0) {
				System.out.println("please enter actions, sepeate with comma:");
				b = new byte[1024];
				haveread = is.read(b);
				readStr = new String(b);
				if (null != readStr) {
					try {
						String[] actionLst = readStr.split(",");
						for (String str : actionLst) {
							actions.add(str.trim());
						}
					} catch (Exception e) {
						System.out
								.println(" format error, the standard is get,set,upload,delete");
					}
				}
			} else {
				System.out.println(" name list : " + memberList);
				System.out.println(" actions list : " + actions);
				break;
			}
		}
		return 0;
	}

	private void generateData() {
		
	}
	
	private InputStream createRCFile(){
		
	}

}

class Member {

	public final String name;
	public final String geo;

	public Member(final String memberName, final String memberGeo) {
		this.name = memberName;
		this.geo = memberGeo;
	}
}
