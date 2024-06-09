package sortArray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamMethods {

	public static void main(String[] args) {

		int[] a= {2,4,5,6,8,10,9,4,8};

		IntStream intStream=	Arrays.stream(a);

		int sum2=  intStream.sorted().sum();
		intStream.parallel();
		
	int sum=  intStream.sum();
		
		System.out.println(sum2);

		System.out.println(intStream.toString());
	}
	
	
}
