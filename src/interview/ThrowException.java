package interview;

public class ThrowException {

	public static void main(String[] args) {
		
		try {
			int a=10;
			a=a/0;
		} finally {
			throw new ArithmeticException();
			
		}
	}
}
