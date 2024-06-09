package javaguides;

public class GivenPrimeNumberOrNot {

	public static void main(String[] args) {
		
		int a=24;
		int flag=0;
		if(a==0 || a==1) {
			System.out.println("Not prime");
		}
		else {
			for(int i=2;i<a/2;i++) {
				if( a%i==0) {
					flag++;
					System.out.println("not prime");
				}
			}
		}
		if(flag==0) {
			System.out.println("Prime number");
		}
	}
}
