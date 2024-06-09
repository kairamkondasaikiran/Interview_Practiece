package practice;

public class GuessOutput3 {

	public static void main(String[] args) {
		String s1=new String("Cloud Tech");
		String s2=new String("Cloud Tech");
		
		if(s1.equals(s2)) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equals");
		}
		
		if(s1==s2) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equals");
		}
		
	}
}
