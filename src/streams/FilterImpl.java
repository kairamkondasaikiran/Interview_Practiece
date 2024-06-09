package streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterImpl {

	public static void main(String[] args) {
		
		List<Integer> s= Arrays.asList(13,25,90,80,20,33);
		
	  List<Integer> evenList=s.stream().filter(i -> i%2==0).toList();
	  List<Integer> oddList= s.stream().filter(a-> a%2!=0).collect(Collectors.toList());
	  
		System.out.println(s);
		System.out.println(evenList);
		System.out.println(oddList);
	}
}
