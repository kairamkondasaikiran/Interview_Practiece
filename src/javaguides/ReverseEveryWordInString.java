package javaguides;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEveryWordInString {

	public static void main(String[] args) {
		
		String s="hello world";
		String[] arr=s.split(" ");
		
		List<String> rev=Arrays.stream(arr).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.toList());
		System.out.println(rev);
		
		String finalValue="";
		for(String word:arr) {
			finalValue=finalValue+reverse(word)+" ";
		}
		System.out.println(finalValue);
	}
	
	public static String reverse(String a) {
		
		String revrse="";
		for(int i=0;i<a.length();i++) {
			revrse=a.charAt(i)+revrse;
		}
		return revrse;
	}
}
