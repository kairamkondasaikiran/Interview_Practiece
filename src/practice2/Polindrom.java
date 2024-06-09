package practice2;

public class Polindrom {

	public static void main(String[] args) {
		
		String s="dad";
		String revrse="";
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			revrse=ch+revrse;
		}
		if(s.equalsIgnoreCase(revrse))
			System.out.println("Polindrom");
		System.out.println(revrse);
	}
}
