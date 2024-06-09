package javaguides;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGivenWordOccurenceInString {

	public static void main(String[] args) {
		
		String s=" the java is lang and java is obj";
		
		String subString ="java";
		
		int count=0;
		int index=0;
		
		
		while((index =s.indexOf(subString, index)) != -1) {
			System.out.println(index =s.indexOf(subString, index));
			count++;
			index += subString.length();
		}
		System.out.println(subString+" "+ count);
		
		 Pattern pattern = Pattern.compile(subString);
		 System.out.println(pattern);
	        Matcher matcher = pattern.matcher(s);
	        
	        int count1 = 0;
	        while (matcher.find()) {
	            count1++;
	        }
	       
	}
}
