package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortUsingSalary {

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
		
		
		Map<String,Long> m= list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		m.entrySet().forEach(entry ->{
			System.out.println(" key "+entry.getKey()+" "+entry.getValue());
		});
		
		List<Employee>  cap= list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
		System.out.println("capgemini"+ cap);
		
	double second=	list.stream().mapToDouble(Employee::getSalary).boxed().sorted((a,b)-> Double.compare(a, b)).skip(2).findFirst().orElse(null);
		
		System.out.println("second "+second);
	List<Employee> f=	list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
	System.out.println(" f"+f);	
		
	
	
		
	double d=	list.stream().mapToDouble(Employee::getSalary).boxed().sorted((a,b) -> Double.compare(a, b)).skip(3).findFirst().orElse(Double.NaN);
		System.out.println(d);
		
int c=	list.stream().mapToInt(Employee::getDeptId).boxed().sorted((a,b) -> Integer.compare(a, b)).skip(2).findFirst().orElse(null);
	
	System.out.println(c);
	
		   List<List<Employee>> listOfLists = Arrays.asList(
	                Arrays.asList(new Employee("sai", 25, 30000.00, "DXC", 1), new Employee("kiran", 26, 35000.00, "IT", 2)),
	                Arrays.asList(new Employee("saikiran", 27, 33000.00, "CSC", 3), new Employee("pinnu", 28, 40000.00, "Vupadhi", 4)),
	                Arrays.asList(new Employee("prasanna", 28, 60000.00, "DXC", 5), new Employee("reddy", 29, 70000.00, "DXC", 6))
	        );
		   
		   List<List<Employee>> listOfLists1=   listOfLists.stream().filter(innerLoop -> innerLoop.stream().mapToDouble(Employee::getSalary).sum() > 10000.00).collect(Collectors.toList());
		
		System.out.println(listOfLists1);
		//get employee salary above 50000 
		
		
		List<Employee> listOfEmployeeAboveSalary= list.stream().filter(e -> e.getSalary() > 50000.00).collect(Collectors.toList());
		System.out.println(listOfEmployeeAboveSalary);
		 System.out.println("#*************************#");
		
		//listOfEmployeeAboveSalary.stream().(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
		 
	 list.sort(Comparator.comparingDouble(Employee::getSalary));
	 System.out.println(list);
	 
	 System.out.println("#*************************#");
	 
	Map<String, List<Employee>> groupByOfEmployee= list.stream().collect(Collectors.groupingBy(Employee::getDept));
	
	
	
	
	
	groupByOfEmployee.forEach((dpt,employeeList) ->{
		
		System.out.print(dpt+" ---");
		employeeList.forEach(System.out::println);
	});
	 
	System.out.println("***************************");
	
	Iterator<Map.Entry<String, List<Employee>>> itr= groupByOfEmployee.entrySet().iterator();
	while (itr.hasNext()) {
		Map.Entry<String, List<Employee>> data= itr.next();
		System.out.println(data.getKey()+"  "+ data.getValue());
	}
	
	}
}
