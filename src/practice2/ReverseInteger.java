package practice2;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int a=101;
		
		String s=Integer.toString(a);
		String rev="";
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			rev=ch+rev;
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Polindrom");
		}
		
		
		int orignial=a;
		int reverse=0;
		
		while(a != 0) {
			
			int b= a%10;
			reverse=reverse*10+b;
			a /= 10;
		}
		
		if(orignial==reverse) {
			System.out.println("Polindrom");
		}
	}
}
