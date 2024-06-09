package practice2;

import java.util.stream.Collectors;

public class Anagram {

	public static void main(String[] args) {
		
		
		String s="Sai";
		String a="ias";
		
		String input1=s.toLowerCase().chars().sorted().mapToObj(ch -> String.valueOf((char)ch)).collect(Collectors.joining());
		
		String input2=a.toLowerCase().chars().sorted().mapToObj(ch -> String.valueOf((char)ch)).collect(Collectors.joining());
		
		System.out.println(input1.equalsIgnoreCase(input2));
		
		
	}
}
