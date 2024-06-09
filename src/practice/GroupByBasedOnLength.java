package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByBasedOnLength {

	
	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("sai","kiran","chintu","prass");
		
		List<String> list1=Arrays.asList("sai","kiran","saikiran");

		Map<Integer, List<String>> map1=list1.stream().collect(Collectors.groupingBy(String::length));
		
	  Map<Integer, List<String>>	map=list.stream().collect(Collectors.groupingBy(String::length));
	  
	  System.out.println(map);
	  
	  List<String> joinList= Arrays.asList("Hello"," ","World","!");
	  
	 String joinString= joinList.stream().collect(Collectors.joining());
	 
	 System.out.println(joinString);
	  
	}
}

