package javaguides;

public class PremutationsOfString {

	public static void main(String[] args) {
		
		String s="sai";
		premutations(s, "");
		System.out.println(s);
	}
	public static void premutations(String input,String ans) {
		
		if(input.length() ==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<input.length();i++) {
			char ch= input.charAt(i);
			String remain= input.substring(0, i) + input.substring(i+1);
			premutations(remain,ans+ch);
		}
	}
}
