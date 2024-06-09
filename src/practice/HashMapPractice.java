package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("sai", 100);
		map.put("kiran", 300);
		map.put("saikiran", 400);
		map.put("prasanna", 500);
		map.put("chinnu", 600);
		
		Iterator<Map.Entry<String, Integer>> itr= map.entrySet().iterator();
		
		while (itr.hasNext()) {
		Map.Entry<String, Integer> m=	itr.next();
		System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		
		Iterator<Map.Entry<String, Integer>> data=map.entrySet().iterator();
		
		while(data.hasNext()) {
			
			Map.Entry<String, Integer> a= data.next();
			System.out.println(a.getKey()+"  "+ a.getValue());
		}
		
		
		
		
		
		
		
		
		
		
	}
}
