package interview;

@FunctionalInterface
public interface Functional {

	public void method();
	
	public static void staticMethod() {
		
	}
	default void defaultMethod() {
		
	}
}
