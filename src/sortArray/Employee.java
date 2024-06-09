package sortArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	 private String name;
	    private double salary;

	    public Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "name='" + name + '\'' +
	                ", salary=" + salary +
	                '}';
	    }
	    public static void main(String[] args) {
			
	    	  List<Employee> employees = Arrays.asList(
	                  new Employee("Alice", 50000),
	                  new Employee("Bob", 60000),
	                  new Employee("Charlie", 45000),
	                 new Employee("David", 70000)
	          );
	    	  
	    	List<Employee> list =employees.stream().filter(e -> e.getSalary()> 50000).collect(Collectors.toList());
	    	  
	    	System.out.println(list);
	    	
	    	
	    	
	    	  employees.stream().forEach(e -> {
	    		  if(e.getSalary() > 50000) {
	    			  System.out.println(e.getSalary());
	    		  }
	    	  });
	    	  
	    	 List<Employee> nameSort= employees.stream().sorted((e1,e2)-> e1.getName().compareTo(e2.getName())).toList();
		
	    	 employees.stream().sorted((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary())).toList();
	    	
	    	 employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().map(Employee::getSalary).orElse(Double.NaN);
	    	
	    	 List<Employee> SalarySort	= employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).collect(Collectors.toList());
	   nameSort.forEach(e -> System.out.println(e));
	   SalarySort.forEach(e -> System.out.println(e));
	   
	    }
}
