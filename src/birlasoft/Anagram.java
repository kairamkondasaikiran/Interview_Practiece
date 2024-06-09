package birlasoft;

import java.util.stream.Collectors;

public class Anagram {

	public static void main(String[] args) {
		
		anagramCheck("sai", "ias");
	}
	
	public static boolean anagramCheck(String input1,String input2) {
		
		if(input1 == null || input2 ==null || input1.length() != input2.length()) {
			
			return false;
			
		}
		
	
		
	String sortedStr1=	input1.toLowerCase().chars().sorted().mapToObj(ch -> String.valueOf((char)ch)).collect(Collectors.joining());
		
	String sortedStr2 = input2.toLowerCase().chars().sorted().mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining());
		
		System.out.println(sortedStr1);
		System.out.println(sortedStr2);
		return sortedStr1.equals(sortedStr2);
		
	}
}
