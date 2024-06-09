package leetCode;

public class Palindrom {

	
	public static void main(String[] args) {
		
		int input=1981;
		System.out.println(isPalindrome(input));
		
		String s=Integer.toString(input);
		
		char ch=s.charAt(0);
		char ch2=s.charAt(s.length()-1);
		
		if(s.length() > 1&& ch==ch2) {
			System.out.println("Polindrom");
		}
		else {
			System.out.println("not");
		}
	}
	
	 private static boolean isPalindrome(int num) {
	        int originalNum = num;
	        int reversedNum = 0;

	        while (num != 0) {
	            int digit = num % 10;
	            System.out.println(digit);
	            reversedNum = reversedNum * 10 + digit;
	            System.out.println(reversedNum);
	            num /= 10;
	        }

	        return originalNum == reversedNum;
	    }
}
