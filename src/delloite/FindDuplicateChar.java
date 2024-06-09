package delloite;

import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateChar {

	public static void main(String[] args) {
		String s="hellooo";
		
		Map<Character, Long> map=s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(a ->a,Collectors.counting()));
		
		System.out.println(map);
		
		
		s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(a ->a,Collectors.counting()));
		
		for(int i=0;i<s.length();i++) {
			
			int count=0;
			char ch1=s.charAt(i);
			for(int j=i;j<s.length();j++) {
				
				char ch2=s.charAt(j);
				if(ch1 == ch2) {
					count++;
				}
			}
			if(count > 1) {
				
				System.out.println("This "+ch1+ " is repeated");
				
			}
			
		}
	}
}
