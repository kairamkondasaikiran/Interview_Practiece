package sortArray;

public class CheckGivenCharOccurence {

	public static void main(String[] args) {
		
		String s="Saikiran";
		
		char c='a';
		int count=0;
		
		for(int i=0; i< s.length();i++) {
			
			char ch=s.charAt(i);
			if(c==ch) {
				count=count+1;
				//System.out.println(s.indexOf(ch));
			}
		}
		System.out.println(count);
}
}
