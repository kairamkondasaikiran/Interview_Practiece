package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NamesStartsWithLetter {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("sai","kiran","Saikiran");
		
		list.stream().filter(a -> a.toLowerCase().startsWith("s")).collect(Collectors.toList());
		
	    Map<Integer, List<String>>	m=list.stream().collect(Collectors.groupingBy(String::length));
	    
	    System.out.println(m);
	}
}
