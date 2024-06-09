package javaguides;

public class VowelsInString {

	public static void main(String[] args) {
		
		String vowe="aeiou";
		String s="sai";
		
		boolean flag=s.toLowerCase().matches(".*[aeiou].*");
		System.out.println(flag);
		
		
	}
}
