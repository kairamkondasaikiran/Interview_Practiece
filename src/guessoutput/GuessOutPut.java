package guessoutput;

public class GuessOutPut {

	public static void main(String[] args) {
		System.out.println(foo());
		
		
	}
	
	static int foo() {
		
		//static int a=10;
		
		int a=10;
		
		++a;
		//a++;
		
		System.out.println(a++);
		System.out.println(++a);
		return a;
		
	}
}
