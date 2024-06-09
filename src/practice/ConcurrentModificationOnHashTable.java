package practice;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationOnHashTable {

	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new Hashtable<>();
		
		String c="Java";
		c.concat("Program");
		System.out.println(c);
		
		map.put("sai", 1);
		map.put("Kiran", 2);
		map.put("prasanna", 3);
		map.put("saikiran", 4);
		
		
	    
		for(Map.Entry<String, Integer> a:map.entrySet()) {
			
			System.out.println(a.getKey()+" "+a.getValue());
			map.remove("Kiran");
		}
	}
}

