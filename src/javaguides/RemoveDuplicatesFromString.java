package javaguides;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		
		String s="saikiran";
		String unique="";
		
		char []c=s.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<s.length();i++) {
			int count=0;
			char ch=s.charAt(i);
			for(int j=i;j<s.length();j++) {
				
				char ch1=s.charAt(j);
				if(ch==ch1) {
					count++;
				}
			}
			if(count<=1) {
				unique=unique+ch;
			}
		}
		System.out.println(unique);
		
	String val=	s.chars().mapToObj(g-> (char) g).distinct().map(String::valueOf).collect(Collectors.joining());
	System.out.println("val "+val);
	
	
	}
}
