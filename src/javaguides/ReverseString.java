package javaguides;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="sai";
		
		StringBuilder build=new StringBuilder();
		
		for(int i=s.length()-1;i >= 0;i--) {
			char ch=s.charAt(i);
			build.append(ch);
		}
		System.out.println(build);
	}
}
