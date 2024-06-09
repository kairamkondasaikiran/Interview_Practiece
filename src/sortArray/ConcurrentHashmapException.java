package sortArray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ConcurrentHashmapException {

	public static void main(String[] args) {
		 
		Map<String, Integer> map= new HashMap<>();
		
		map.put("saikiran", 100);
		map.put("sai", 300);
		map.put("kiran", 200);
		map.put("prasanna", 500);
		
		
		  for(Map.Entry<String, Integer> entry: map.entrySet()) {
		  
		  System.out.println(entry.getKey()+" "+entry.getValue()); 
		  map.remove("sai");
		  }
		 
		
		Iterator<Map.Entry<String, Integer>> iterator =map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			
		Map.Entry<String, Integer> m=	iterator.next();
		System.out.println(m.getKey()+" "+ m.getValue());
		iterator.remove();
			
		}
	}
}
