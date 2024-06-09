package sortArray;

import java.util.List;

public class CountOwalsInString {

	public static void main(String[] args) {
		
		char[] owals={'a','e','i','o','u'};
		
		String s="prasanna";
		System.out.println(s);
		
		int count=0;
		char[] charcter= s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			
			for(int j=0;j<owals.length;j++) {
				
				char o=s.charAt(i);
				char ch=owals[j];
				if(o==ch) {
					
					count=count+1;
					//break;
				}
			
			}
		}
		System.out.println(count);
		for(char c:charcter) {
			
			if (List.of("a","e","i","o","u").contains(c)) {
				count=count+1;
				System.out.println(charcter[1]);
			}
			
		}
		
	}
	
}
