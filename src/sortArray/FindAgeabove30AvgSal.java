package sortArray;

import java.util.Arrays;
import java.util.List;

public class FindAgeabove30AvgSal {

	public static void main(String[] args) {
		
		List<EmployeeWithAge> emp =Arrays.asList(
				new EmployeeWithAge("sai", 20, 20000.00, "IT"),
				new EmployeeWithAge("kiran", 31, 30000.00, "CSC"),
				new EmployeeWithAge("prass", 20, 25000.00, "C"),
				new EmployeeWithAge("chinnu", 32, 30000.00, "Software")
				
				);
		
		double d=emp.stream().filter(e -> e.getAge() > 30).mapToDouble(EmployeeWithAge::getSalary).average().orElse(0.0);
	System.out.println(d);		
	
	//emp.stream().filter(a -> a.getAge()> 30).mapToDouble(null).average();
	
		
	}
}
