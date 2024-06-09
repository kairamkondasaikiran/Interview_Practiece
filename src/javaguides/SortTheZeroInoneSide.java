package javaguides;

import java.util.Arrays;

public class SortTheZeroInoneSide {

	public static void main(String[] args) {
		
		int[] a= {3,6,7,0,5,1,0,9,0};
		int[] arr= new int[a.length];
		int nonZero=0;
		int zero=a.length-1;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == 0) {
				arr[zero]=a[i];
				zero--;
				
			}
			else {
				arr[nonZero]=a[i];
				nonZero++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

