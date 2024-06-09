package sortArray;

import java.util.Scanner;

public class CheckGivenValuePresentInArray {

	public static void main(String[] args) {
		
		int[] a= {3,5,6,7,8,9};
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=false;
		Integer index=0;
		
		for(int i=0;i<a.length;i++) {
		
		if(n== a[i]) {
			
			flag=true;
			index=i;
		}
		}
		if(flag==true)
		System.out.println("Element "+n+" is present at "+index);
		if(flag!=true)
		System.out.println("Not presnt");
	}
}
