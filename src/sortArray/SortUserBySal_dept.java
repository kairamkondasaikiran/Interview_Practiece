package sortArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortUserBySal_dept {

	public static void main(String[] args) {
		
		
		Function<Integer, Integer> f=(a)->a*a;
		
		Integer h= f.apply(5);
		System.out.println(h);
		
		BiFunction<Integer, Integer, Integer> k=(i,j)-> i+j;
		
	 int  biFun	=k.apply(3, 5);
	 
	 System.out.println(biFun);
		
		  List<User> employees = Arrays.asList(
	                new User("HR", 50000),
	                new User("HR", 60000),
	                new User("IT", 75000),
	                new User("IT", 80000),
	                new User("IT", 70000),
	                new User("Finance", 90000),
	                new User("Finance", 95000)
	        );
		  
		  
		double o=  employees.stream().collect(Collectors.averagingDouble(User::getSalary));
		
		System.out.println(Math.round(o));
		
	Map<String, Double> l=	employees.stream()
        .filter(employee -> employee.getSalary() > 35000)
        .collect(Collectors.groupingBy(
        		User::getDepartment,
                Collectors.averagingDouble(User::getSalary)
        ));
	
	System.out.println(l);
		
	Map<String, Double> m=	employees.stream().filter(v -> v.getSalary() > 50000).collect(Collectors.groupingBy(User::getDepartment,Collectors.averagingDouble(User::getSalary)));
		
	
	employees.stream().filter(n -> n.getSalary() > 50000.00).collect(Collectors.groupingBy(User::getDepartment,Collectors.averagingDouble(User::getSalary)));	
		
	double highSal=	employees.stream().sorted(Comparator.comparingDouble(User::getSalary).reversed()).findFirst().get().getSalary();
		
	System.out.println(highSal);
	
	double fourthHighSal =employees.stream().sorted(Comparator.comparingDouble(User::getSalary).reversed()).skip(3).findFirst().get().getSalary();
		  
	System.out.println("Fourth High SAL"+ fourthHighSal);
		Map<String, Double> avgOfDept= employees.stream().collect(Collectors.groupingBy(User::getDepartment,Collectors.averagingDouble(User::getSalary)));
		  
		  
		 System.out.println(avgOfDept); 
		  
	List<User>	salaryDesc=  employees.stream().sorted((a,b)-> Double.compare(a.getSalary(), b.getSalary())).collect(Collectors.toList());
	salaryDesc.forEach(e ->{
		System.out.println(e.getSalary());
	});
	
	System.out.println("----------------");
	List<User>	salaryAesc=  employees.stream().sorted(Comparator.comparingDouble(User::getSalary).reversed()).collect(Collectors.toList());
	
	salaryAesc.forEach(s ->{
		System.out.println(s.getSalary());
	});
	
	System.out.println(salaryDesc);
//		   Map<String, Double> map= employees.stream().collect(Collectors.groupingBy(User::getDepartment,Collectors.mapping(User::getSalary, Collectors.collectingAndThen(Collectors.maxBy(Comparator.naturalOrder()), maxSal -> maxSal.orElse(0.0))));
		  Map<String, Double> map=  employees.stream()
          .collect(Collectors.groupingBy(User::getDepartment,
                  Collectors.mapping(User::getSalary,
                          Collectors.collectingAndThen(Collectors.maxBy(Comparator.naturalOrder()), maxSalary -> maxSalary.orElse(0.0)))));

		 System.out.println(map);
		  
		  employees.stream().mapToDouble(User::getSalary).boxed().sorted((a,b)-> Double.compare(a, b)).skip(1).findFirst();
	
	}
}
