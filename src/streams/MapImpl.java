package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapImpl {

	public static void main(String[] args) {
		
		List<Integer> marks=Arrays.asList(20,30,40,35,56,80,49);
		
		List<Integer> failed=marks.stream().filter(i-> i>35).collect(Collectors.toList());
		
		System.out.println(marks);
		System.out.println(failed);
		
		List<Integer> graceMarks=marks.stream().filter(a -> a>35).map(b -> b+5).collect(Collectors.toList());
		
		System.out.println(graceMarks);
		
		Long failedStudents= marks.stream().filter(i-> i<=35).count();
		
		System.out.println(failedStudents);
		
	}
}
