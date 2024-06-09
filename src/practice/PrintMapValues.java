package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrintMapValues {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("sai", "1");
		map.put("sai", "2");
		map.put("kiran", "3");
		
		
		for(Map.Entry<String, String> entry:map.entrySet()) {
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		Iterator<Map.Entry<String, String>> ma=map.entrySet().iterator();
		
		while(ma.hasNext()) {
			
			Map.Entry<String, String> s=ma.next();
			
			System.out.println(s.getKey()+" "+s.getValue());
		}
		
	}
}
