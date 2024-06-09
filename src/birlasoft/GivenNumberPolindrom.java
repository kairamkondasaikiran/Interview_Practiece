package birlasoft;

public class GivenNumberPolindrom {

	public static void main(String[] args) {
		
		int a=121;
		int revesed=0;
		
		StringBuilder builder= new StringBuilder(String.valueOf(a));
		System.out.println(builder.reverse());
		
		
		while (a != 0) {
            int digit = a % 10;
            System.out.println(digit);
            revesed = revesed * 10 + digit;
            System.out.println(revesed);
            a /= 10;
            System.out.println(a);
        }
		
		System.out.println("final "+revesed);
	}
}
