package practice;

public class RemoveOwalsFromString {

	public static void main(String[] args) {
		
		String s="hello world how are you";
		
		String owals="aeiou";
		
		String newString="";
		int count=0;
		for(char c:s.toCharArray()) {
			
			if(owals.indexOf(c) != -1) {
				newString=newString+c;
			}
			else {
				count++;
			}
		}
		System.out.println(newString);
		System.out.println(count);
	}
}
