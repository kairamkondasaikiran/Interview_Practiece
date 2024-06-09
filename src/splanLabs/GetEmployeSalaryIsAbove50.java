package splanLabs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import practice.Employee;

public class GetEmployeSalaryIsAbove50 {

	public static void main(String[] args) {
		
Map<String, Employee> map= new HashMap<>();
		
		map.put("sai", new Employee("sai", 26, 60.00, "IT", 1));
		map.put("kiran", new Employee("kiran", 25, 70.00, "IT", 3));
		map.put("saikiran", new Employee("saikiran", 24, 40.00, "IT", 1));
		
	    Map<String, Employee>	m=map.entrySet().stream().filter(a -> a.getValue().getSalary() > 50.00).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
	
	    
	    
	    
	    
	System.out.println(map);
	System.out.println(m);
	
	}
}
