package sortArray;

import java.util.Arrays;

public class SortInetersInorder {

	public static void main(String[] args) {
		
		int[] a= {3,6,8,9,2,1};
		
		Arrays.sort(a);
		//Arrays.sort(a,Collections.reverseOrder());
		
		int c=5;
		int d=6;
		
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println(c +" "+d);
		
		
		
		for(int i=0;i<a.length;i++) {
			int temp=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i] > a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		
	
	for(int b:a) {
		System.out.println(b);
	}
	for (int i = 0; i < a.length / 2; i++) {
	    int temp = a[i];
	    a[i] = a[a.length - 1 - i];
	    a[a.length - 1 - i] = temp;
	}
	System.out.println(Arrays.toString(a));
	
	int[] b= {3,6,8,9,2,1};
	for(int i=0;i<b.length;i++) {
		int temp=0;
		for(int j=i+1;j<b.length;j++) {
			if(b[i] > b[j]) {
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(b));
	}
	
	
}
