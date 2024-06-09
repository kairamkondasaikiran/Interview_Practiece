package prasanna;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="prasanna";
		String temp = "";
		for(int i=0;i<s.length();i++) {
		char c=	s.charAt(i);
			System.out.println(c);
			//temp=temp+c;
			
			temp=c+temp;
			
		}
		System.out.println(temp);
		
		for(int j=s.length()-1;j>=0;j--) {
		char ch=	s.charAt(j);
		System.out.println(ch);
		}
		char find ='a';
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=	s.charAt(i);
				if(c==find) {
					count++;
				System.out.println("available");
				
				
				}
			
				
			}
		
		System.out.println(count);
		
	}
}
