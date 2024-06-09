package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindDay {

	public static void main(String[] args) {
		
		List<String> week= Arrays.asList("sun","mon","tue","wed","thu","fri","sat");
		int a=week.indexOf("thu");
		
		System.out.println(a);
		List<Integer> list= new ArrayList<>();
		List<Integer> l1= new LinkedList<>();
		
		
		String day="";
		int key=2;
		
		if(a+key > 6) {
			int val=a+key;
			int index =val%7;
			day=week.get(index);
		}
		else {
			day=week.get(key+a);
		}
		System.out.println(day);
		
		
	}
}
