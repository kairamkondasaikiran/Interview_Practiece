package practice;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		int n=10;
		int flag=0;
		
		if(n==0 || n==1) {
			System.out.println("not prime");
		}
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					flag=1;
					System.out.println("Not prime");
				}
			}
		}
		if(flag==0) {
			System.out.println("prime number");
		}
	
	}
}
