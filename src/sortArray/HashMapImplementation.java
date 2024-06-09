package sortArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class HashMapImplementation {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("sai", 76618);
		map.put("kiran", 990871);
		map.put("prasanna", 70322);
		map.put("chinnu", 76618);
		
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			
			System.out.println(entry.getKey()+" "+" "+entry.getValue());
		}
		System.out.println("********************************");
		
		Iterator<Map.Entry<String, Integer>> iterator= map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			
		Map.Entry<String, Integer> entry=	iterator.next();
		
		System.out.println(entry.getKey()+"  "+"   "+ entry.getValue());
			
		}
		
		System.out.println("********************************");
		ListIterator<Map.Entry<String, Integer>> listIterator= new ArrayList<>(map.entrySet()).listIterator();
		
		while (listIterator.hasNext()) {
			Map.Entry<String, Integer> a= listIterator.next();
			System.out.println(a.getKey()+" **** "+a.getValue());
			
		}
	}
}
