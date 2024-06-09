package practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEveryWord {

	public static void main(String[] args) {
		
		String a="hello welcome world";
		String [] arr=a.split(" ");
		
	List<String> list= Arrays.asList(arr).stream().map(s-> new StringBuilder(s).reverse().toString()).collect(Collectors.toList());
	System.out.println(list);
	
	
	
	
	String r=Arrays.stream(arr).map(f -> new StringBuilder(f).reverse().toString()).toString();
	System.out.println(r.toString());
	
	
	String word="";
	for(int i=0;i<arr.length;i++) {
		word=word+reverse(arr[i])+" ";
	}
	
	System.out.println(word);
	String s="saikiran";
	
	
	}
	public static String reverse(String input) {
		
		String rev="";
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			rev=ch+rev;
		}
		return rev;
	}
}
