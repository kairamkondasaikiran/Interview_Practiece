package javaguides;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateWordsInJava {

	public static void main(String[] args) {

		String s="hello world welcome hello welcome";

		String []arr=s.split(" ");

		for(int i=0;i<arr.length;i++) {
			String word1=arr[i];
			int count=0;
			for(int j=i;j<arr.length;j++) {
				String word2=arr[j];
				if(word1.equals(word2)) {
					count++;
				}
			}
			if(count > 1) {
				System.out.println(word1);
			}
		}
		Map<String, Long> map=Arrays.stream(arr).collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
		map.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> System.out.println(" "+entry.getValue()+" "+entry.getKey()));
	}
}
