package birlasoft;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MergeTwoArryasIntoOne {



	public static void main(String[] args) {

		int [] a1= {3,4,1,4,5,2};
		int [] a2= {8,6,7,2,9,10};

		int []ar= IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).sorted().toArray();

		System.out.println(Arrays.toString(ar));

		int[]	uniqueVal=IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).sorted().distinct().toArray();
		
		System.out.println(Arrays.toString(uniqueVal));
	}
}
