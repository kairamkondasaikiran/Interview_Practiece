package javaguides;

import java.util.Arrays;

public class MoveZeroToOneSideOtherToRightSide {

	public static void main(String[] args) {
		
		int[] a= {1,0,0,1,0,2};
		int count=0;
		int[] b=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			if(a[i] !=0) {
				b[count]=a[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
