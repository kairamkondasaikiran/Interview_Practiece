package sortArray;

public class SumofStringNumbers {

	public static void main(String[] args) {
		
		String s="sai2ki3lka0js1";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				sum=sum+Character.getNumericValue(s.charAt(i));
				
			}
		}
		System.out.println(sum);
	}
}

