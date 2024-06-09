package sortArray;

public class SingleTonClass {

	private static SingleTonClass singleTonClass;
	
	private SingleTonClass() {
		
	}
	
	public static SingleTonClass getInstance() {
		
		if(singleTonClass == null) {
			
			singleTonClass=	new SingleTonClass();
		}
		return singleTonClass;
	}
}
