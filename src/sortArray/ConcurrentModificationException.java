package sortArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {
	
	private static final List<String> list=new ArrayList<>();

	public static void main(String[] args) {
		
	
		list.add("sai");
		list.add("kiran");
		list.add("prasanna");
		list.add("chinnu");
		
		
		 synchronized (list) {
				
				for(String d:list) {
					
					System.out.println(d);
					if(d.equals("sai"))
					list.remove(0);
				}
			}
		
		for(String s:list) {
			System.out.println(s);
			try {
				
				/*
				 * if(s.equals("kiran")) list.remove("kiran");
				 */
				
			} catch (Exception e) {
				
			}
			
		}
		
		Iterator<String> s= list.iterator();
		
		while (s.hasNext()) {
			
		String a=s.next();
		System.out.println(a);
		
		
			
		}
         
	}
}
