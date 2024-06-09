package sortArray;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgofSalary {

	public static void main(String[] args) {
		  List<Employee> employees = Arrays.asList(
                  new Employee("Alice", 50000),
                  new Employee("Bob", 60000),
                  new Employee("Charlie", 45000),
                 new Employee("David", 70000)
          );
		  
		 double avg= employees.stream().filter(e -> e.getSalary() > 50000).mapToDouble(Employee::getSalary).average().orElse(Double.NaN);
	
		 
		 System.out.println(avg);
	
	}
}
