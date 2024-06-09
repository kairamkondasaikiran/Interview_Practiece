package javaguides;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort_ReverseArray {

	public static void main(String[] args) {
		
	   List<Integer> list= Arrays.asList(3,4,2,1,4,2,3,1);
	
	   List<Integer> sortList= list.stream().distinct().sorted(Comparator.comparingInt(Integer::intValue).reversed()).toList();
	   System.out.println(sortList);
	   
	}
}
