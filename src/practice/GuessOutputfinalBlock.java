package practice;

public class GuessOutputfinalBlock {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("a");
			return;
			
		} finally  {
			System.out.println("b");
		}
	//unreachable code error due to return statement
	//	System.out.println("a");
	}
}
