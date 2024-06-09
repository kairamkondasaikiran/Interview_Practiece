package javaguides;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeIntoSingleArray {

	public static void main(String[] args) {
		
		int [] a= {3,5,6,7,10,11};
		int [] b= {1,2,4,8,9,12};
		
		int [] c=IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}
}
