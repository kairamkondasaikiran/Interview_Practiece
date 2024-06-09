package javaguides;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CopyTwoArraysRemoveDuplicates {

	public static void main(String[] args) {

		int[] a= {4,0,6,9,1,2,3,8,7};	
		int[] b= {10,11,6,9,12,2,13,8,7};

		int [] concat =IntStream.concat(Arrays.stream(a), Arrays.stream(b)).filter(c -> c !=0).toArray();

		System.out.println(Arrays.toString(concat));

		List<Integer> s=Arrays.asList(4,5,6,9,1,2,3,8,7);
		List<Integer> s1=Arrays.asList(0,11,6,9,12,2,13,8,7);

		Set<Integer> total= Stream.concat(s.stream(), s1.stream()).collect(Collectors.toSet());
		System.out.println(total);
		Integer max=	s.stream().max((x1,x2) -> x1-x2).get();
		Integer min =s.stream().min((x1,x2) -> x1-x2).get();

		System.out.println(max);
		System.out.println(min);


	}
}
