package practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertEveryWordFirstLetter {

	public static void main(String[] args) {
		
		String s="Hello word come to sio";
		
	Arrays.stream(s.split(" ")).map(ch -> Character.toUpperCase(ch.charAt(0))+ch.substring(1)).collect(Collectors.joining(" "));
String res=	Arrays.stream(s.split("\\s+")).map(word -> Character.toUpperCase(word.charAt(0))+ word.substring(1)).collect(Collectors.joining(" "));
	
	System.out.println(res);
	
	}
	
}
