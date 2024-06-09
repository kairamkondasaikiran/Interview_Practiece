package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateDept {

	public static void main(String[] args) {

		Employee e1 = new Employee("sai", 25, 30000.00, "DXC", 1);
		Employee e2 = new Employee("kiran", 24, 40000.00, "CSC", 2);
		Employee e3 = new Employee("prasanna", 23, 50000.00, "IT", 2);
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

		Set<Integer> set= new HashSet<>();
		
	List<Employee> unique=	list.stream().filter(e -> set.add(e.getDeptId())).collect(Collectors.toList());
		
		unique.forEach(System.out::println);
		
		
		list.stream().map(Employee::getDept).distinct().forEach(System.out::println);

		Map<String, Long>	map=list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));

		Map<String, List<Employee>> group=list.stream().collect(Collectors.groupingBy(Employee::getDept));
		
		System.out.println(map);
		System.out.println(group);

		Collector<Employee, ?, Integer> s=  Collectors.summingInt(Employee::getAge);

		Map<String, Double> ageAvg= list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingInt(Employee::getAge)));

		System.out.println(ageAvg);
		
		
	}
}
