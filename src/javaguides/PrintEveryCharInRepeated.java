package javaguides;

public class PrintEveryCharInRepeated {

	public static void main(String[] args) {
		
		String s="s3a2i8";
		
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				int row=Character.getNumericValue(ch);
				for(int j=0;j<row;j++) {
					System.out.println(s.charAt(i-1));
					if(j==row) {
						break;
					}
				}
			}
			
		}
	}
}
