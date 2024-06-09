package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStringLength {

	public static void main(String[] args) {
		
	  List<String> s=Arrays.asList("sai","nav","kiran","saikiran");
		
	  Map<Integer, List<String>>	map=s.stream().collect(Collectors.groupingBy(String::length));
	
	  System.out.println(map);
	}
}

