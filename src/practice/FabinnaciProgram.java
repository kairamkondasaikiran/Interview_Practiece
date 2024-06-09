package practice;

public class FabinnaciProgram {

	public static void main(String[] args) {
		fabinaci(5);
	}
	
	public static void fabinaci(int n) {
		
		int first=0;
		int second=1;
		for(int i=0;i<n;i++) {
		System.out.println(first);
		
		int next = first+second;
		first=second;
		second=next;
		}
	}
}
