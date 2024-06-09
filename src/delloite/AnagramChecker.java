package delloite;

import java.util.Map;
import java.util.stream.Collectors;

public class AnagramChecker {

	public static void main(String[] args) {
		
		String s1="sai";
		String s2="ias";
		
		Map<Character, Long> map= s1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(a ->a,Collectors.counting()));
		System.out.println(map);
		map.forEach((character,count)->{
			if(count > 1) {
				System.out.println(character);
			}
		});
		
		String input1=s1.toLowerCase().chars().sorted().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
		String input2=s2.toLowerCase().chars().sorted().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
		System.out.println(input1.equalsIgnoreCase(input2));
		
	}
}
