package javaguides;

import java.util.Arrays;
import java.util.List;

public class SumOfAllIntegers {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(3,4,6,8,10,23,35);
		
		int sum=list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
}
