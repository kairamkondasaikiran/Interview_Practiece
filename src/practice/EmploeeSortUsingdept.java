package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmploeeSortUsingdept {

	public static void main(String[] args) {

		Employee e1 = new Employee("sai", 25, 30000.00, "DXC", 1);
		Employee e2 = new Employee("kiran", 24, 40000.00, "CSC", 2);
		Employee e3 = new Employee("prasanna", 23, 50000.00, "IT", 3);
		Employee e4 = new Employee("chinnu", 26, 70000.00, "Vupadhi", 4);
		Employee e5 = new Employee("saikiran", 27, 60000.00, "DXC", 5);
		Employee e6 = new Employee("Reddy", 28, 80000.00, "IT", 6);


		List<Employee> list= new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);

		String word="qsbhjwedjinecsiubecbuewcnjweciuwelkchbweclwecbjelckebkcebecjl";
		
		
		
	Map<Object, Long> group=	word.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(a-> a,Collectors.counting()));
		System.out.println(group);

		List<Employee>	nameList=list.stream().filter(s-> s.getDept().equals("DXC")).sorted(Comparator.comparing(Employee::getName)).toList();	

		System.out.println(nameList);

		List<Employee>	nameReverseList =list.stream().filter(s-> s.getDept().equals("DXC")).sorted(Comparator.comparing(Employee::getName).reversed()).toList();

		System.out.println(nameReverseList);

		list.stream().forEach(a->{
			System.out.println(a.getDept());
		});
		word.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(a-> a,Collectors.counting()));

		word.toCharArray();

		String[] stringList= word.split("");
		System.out.println(stringList[0]);

		List<String> listOfWOrd=Arrays.asList(stringList);
		Map<String, Long>	map=listOfWOrd.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
		
		Map<String, Long> groupOfEachWord= listOfWOrd.stream().collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
		

		System.out.println(groupOfEachWord);
		System.out.println(map);
	}

}
