package birlasoft;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByEveryChar {

	public static void main(String[] args) {
		
		String s="sldjksladkmdmkwedmkewdkmlwedmlkwed;mkedk;edlmk;wed;kmed;mkejqsmqwdwdjewddamd";
		
		List<String> list= Arrays.asList(s.split(""));
		Map<String, Long> map= list.stream().collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
		
		System.out.println(map);
	}
}
