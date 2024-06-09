package siri;

public class ExceptionOccurs {

	public static void main(String[]args){
		
		int a=10;
		int b=0;
		
		
		
		try {
		
		System.out.println(a/b);
		method();
		
		}
		catch(ArithmeticException e) {
			 
			System.out.println("Exception occured due to+" +b);
			
		}
		finally {
			
		}
	}
	
	public static void method() throws ArithmeticException{
		
		int a=10;
		int b=0;
		
		
		
		System.out.println(a/b);
	}
}
