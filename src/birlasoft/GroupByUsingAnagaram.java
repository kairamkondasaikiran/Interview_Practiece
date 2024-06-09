package birlasoft;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByUsingAnagaram {

	public static void main(String[] args) {
		
		String array[]= {"cat","dog","act","god","tac"};
		
		Map<String, List<String>> map= Arrays.stream(array).collect(Collectors.groupingBy(GroupByUsingAnagaram::sortString));
		
		System.out.println(map.values());
	}
	
	public static String sortString(String str) {
		
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
}
