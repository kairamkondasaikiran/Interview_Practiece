package splanLabs;

import java.util.HashMap;
import java.util.Map;

import practice.Employee;

public class IncreseSalaryUsingHashMap {

	public static void main(String[] args) {
		
		Map<String, Employee> map= new HashMap<>();
		
		map.put("sai", new Employee("sai", 26, 60.00, "IT", 1));
		map.put("kiran", new Employee("kiran", 25, 70.00, "IT", 3));
		map.put("saikiran", new Employee("saikiran", 24, 40.00, "IT", 1));
		
		map.entrySet().stream().filter(a -> a.getValue().getAge() > 25).forEach(b->{
			b.getValue().setSalary(b.getValue().getSalary()*1.1);
			
		});
		
		System.out.println(map);	
		
	}
}
