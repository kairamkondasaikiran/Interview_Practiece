package practice;

import java.util.Arrays;

public class AnagramChecker {
	
	
	
	public static void main(String[] args) {
		
		String s="listen";
		String a="silent";
		char[] first=s.toCharArray();
		char[] second=a.toCharArray();
		
		Arrays.sort(first);
		Arrays.sort(second);
		
		if(Arrays.equals(first, second)) {
			System.out.println("same1");
		}
		
		
		 int[] charCount = new int[256]; // Assuming extended ASCII characters

	        // Count character frequencies in the first string
	        for (int i = 0; i < s.length(); i++) {
	           int d= charCount[s.charAt(i)]++;
	           System.out.println(s.charAt(i)+ " "+ d);
	            System.out.println(charCount[i]);
	        }
		
		int count=0;
		if(s.length()== a.length()) {
			
			for(int i=0;i<s.length();i++) {
				
				char ch=s.charAt(i);
				for(int j=0;j<a.length();j++) {
					
					char ch1=a.charAt(j);
					
					
					if(ch==ch1) {
						
						count=count+1;
					}
					
				}
			}
		}
		else {
			
		}
		if(count==s.length()) {
			System.out.println("same");
		}
	}
}
