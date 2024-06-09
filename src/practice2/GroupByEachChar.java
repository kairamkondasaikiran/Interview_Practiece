package practice2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByEachChar {

	public static void main(String[] args) {

		String s="sqwdhjwdhbewaaqjwekcdnccfhvshdbslcmdschkdcvfd";

		List<String> list= Arrays.asList(s.split(""));
		
		Map<Character, Long> map= s.chars().mapToObj(a -> (char)a).collect(Collectors.groupingBy(c ->c,Collectors.counting()));

		map.entrySet().forEach(entry ->{
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		});
		Map<String, Long>	groupList=list.stream().collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
		System.out.println(groupList);

       groupList.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> {
    	   System.out.println(" "+entry.getKey()+ " "+ entry.getValue());
       });

	}

}
