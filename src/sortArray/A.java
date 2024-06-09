package sortArray;

public class A {

	int a;
	int b;
transient	int c;
	
	public void m1()
	{
		System.out.println("A m1");
	}
	public static void main(String[] args) {
		A a =new A();
		a.m1();
		B b = new B();
		
	}
}
class B extends A{

	public B() {
		super();
		System.out.println("b");
		
	}
	public void m1()
	{
		System.out.println("B m1");
		super.m1();
	}
}
