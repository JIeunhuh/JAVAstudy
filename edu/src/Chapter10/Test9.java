package Chapter10;

import java.util.Map;
import java.util.TreeMap;

public class Test9 {
	public static void main(String[] args) {
		TreeMap<String, String> users = new TreeMap<String, String>();

		users.put("20080319", "김푸름");
		users.put("20000606", "김하늘");
		users.put("20071014", "오정임");
		users.put("20050701", "김유빈");
		users.put("20120914", "김용빈");
		System.out.println(" " + users.toString());
	
		Map.Entry<String, String> entry =null;
		entry =users.firstEntry();
		System.out.println(entry);
	}
}
