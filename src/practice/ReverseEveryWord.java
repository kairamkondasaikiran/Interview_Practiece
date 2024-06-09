package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEveryWord {

	public static void main(String[] args) {
		
		String s="hello world where";
		
		String [] arr =s.split(" ");
		
	List<String>	list =Arrays.stream(arr).map((word) -> new StringBuilder(word).reverse().toString()).collect(Collectors.toList());
	
	
	String newWord="";
	for(int i=0;i<arr.length;i++) {
		
		String word=arr[i];
		
		for(int j=0;j<word.length();j++) {
			
			char ch=word.charAt(j);
			newWord=ch+newWord;
		}
		
		newWord=newWord+" ";
	}
	System.out.println(newWord);
	
	for(int i=0;i<arr.length;i++) {
		
		String build= new StringBuilder(arr[i]).reverse().toString();
		arr[i]=build;
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	System.out.println(list);
		
		
	}
}
