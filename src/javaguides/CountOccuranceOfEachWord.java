package javaguides;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccuranceOfEachWord {

	public static void main(String[] args) {
		
		String s="hello world welcome hello";
		
		String [] arr =s.split(" ");
		
	Map<String, Long>	map=Arrays.stream(arr).collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
	
	map.entrySet().forEach(entry -> {
		System.out.println("Word: "+entry.getKey()+" repeated "+ entry.getValue());
	});
	
	String s1="hello";
	
	Map<Character, Long> ch= s1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,Collectors.counting()));
	System.out.println(ch);
	
	}
}
