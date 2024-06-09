package delloite;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SeparateOddEvenInArray {

	public static void main(String[] args) {

		int[] s= {3,24,19,10,38,20,34,87,0};

		int[] oddArray=new int[s.length];
		int[] evenArray= new int[s.length];

		Arrays.sort(s);
		int evenSize= 0;
		int oddSize=0;
		for(int i=0;i<s.length;i++) {

			if(s[i]%2 == 0) {

				evenArray[evenSize]=s[i];
				evenSize++;
			}
			else {
				oddArray[oddSize]=s[i];
				oddSize++;
			}
		}
		int[] totalArray=new int[oddArray.length+evenArray.length];
		
		System.arraycopy(evenArray, 0, totalArray, 0, evenArray.length);
		System.arraycopy(oddArray, 0, totalArray, evenArray.length, oddArray.length);
		
		System.out.println(Arrays.toString(totalArray));
		
		int[]	finalArray=IntStream.concat(Arrays.stream(evenArray), Arrays.stream(oddArray)).filter(num -> num !=0).toArray();

		System.out.println(Arrays.toString(finalArray));
		test();

	}
	
	static void test() {
		int[] s= {3,24,19,10,38,20,34,87,0};
		int[] op= new int[s.length];
		int evenCount=0;
		int oddCount=s.length-1;
		
		for(int i=0;i<s.length;i++) {

			if(s[i]%2 == 0) {

				op[evenCount]=s[i];
				evenCount++;
			}
			else {
				op[oddCount]=s[i];
				oddCount--;
			}
		}
		String string = Arrays.toString(op);
		System.out.println("string"+string);
	}
}
