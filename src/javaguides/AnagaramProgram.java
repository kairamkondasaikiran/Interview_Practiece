package javaguides;

import java.util.stream.Collectors;

public class AnagaramProgram {

	public static void main(String[] args) {
		
		String s="sai";
		String a="ias";
		
		String input1=s.toLowerCase().chars().sorted().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
	    String input2=a.toLowerCase().chars().sorted().mapToObj(f -> String.valueOf((char) f)).collect(Collectors.joining());
	if(input1.equalsIgnoreCase(input2))
	    System.out.println("Anagaram");
	}
	
	
}
