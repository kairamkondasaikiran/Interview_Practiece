package javaguides;

import java.util.StringJoiner;

public class StringJoinerConcat {

	public static void main(String[] args) {
		
		StringJoiner s= new StringJoiner(",","[","]");
		s.add("a").add("b").add("c");
		
		String a=s.toString();
		System.out.println(a);
	}
}
