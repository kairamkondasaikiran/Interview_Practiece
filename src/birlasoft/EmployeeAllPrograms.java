package birlasoft;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeAllPrograms {

	public static void main(String[] args) {


		String s="welcome to the world";

		String word= Arrays.stream(s.split(" ")).map(e -> Character.toUpperCase(e.charAt(0))+e.substring(1)).collect(Collectors.joining(" "));

		System.out.println(word);
		List<Employee> empList= new ArrayList<>();

		empList.add(new Employee(1, "sai", "developer", 10, "IT", 300000.00, 28));
		empList.add(new Employee(2, "kiran", "tester", 20, "Product", 200000.00, 25));
		empList.add(new Employee(3, "saikiran", "developer", 10, "IT", 400000.00, 28));
		empList.add(new Employee(3, "prasanna", "HR", 30, "HR", 200000.00, 27));
		empList.add(new Employee(8, "reddy", "manager", 40, "Software", 800000.00, 29));

		Map<String, List<Employee>> groupOfDept= empList.stream().collect(Collectors.groupingBy(Employee::getDept));

		System.out.println(groupOfDept);

		Map<String, Long>	countOfEachDept =empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));

		System.out.println(countOfEachDept);

		Set<Integer> set= new HashSet<>();
		List<Employee>	uniqueEmployee =empList.stream().filter(e -> set.add(e.getId())).collect(Collectors.toList());

		System.out.println(uniqueEmployee);

		List<String> listOfEmployeWithStartingUpperCase= empList.stream()
				.map(name -> name.getName().substring(0, 1).toUpperCase() + name.getName().substring(1))
				.collect(Collectors.toList());
		System.out.println(listOfEmployeWithStartingUpperCase);

		empList.stream().forEach(e ->{
			e.setName(e.getName().substring(0,1).toUpperCase()+e.getName().substring(1));
		});

		System.out.println(empList);

		Map<String, Double> groupOfDeptAvgSal=	empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)));

		System.out.println(groupOfDeptAvgSal);

		Double avgSalaryAboveAge=  empList.stream().filter(e -> e.getAge()>25).collect(Collectors.averagingDouble(Employee::getSalary));

		System.out.println(avgSalaryAboveAge);

		Double avgSal=empList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(avgSal);


		 //List<Employee> a = empList.stream().sorted(Comparator.comparingInt(Employee::getAge));
		// List<Employee> a = empList.stream().map(null)

	//	System.out.println("sort"+a);
	}

}

