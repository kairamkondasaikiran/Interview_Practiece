package splanLabs;

import java.util.ArrayList;
import java.util.List;

import practice.Employee;

public class MainClassForSortSlaryandAdress {

	public static void main(String[] args) {
		
		
		List<User> list = new ArrayList<>();
		
		list.add(new User(1, "sai", 24, 20.00, new Address("hyd", "hyd", 5000072, "TS")));
		list.add(new User(2, "kiran", 25, 10.00, new Address("sec", "hyd", 5000078, "TS")));
		list.add(new User(3, "prasanna", 24, 40.00, new Address("hyd", "hyd", 502102, "TS")));
		list.add(new User(4, "saikiran", 25, 30.00, new Address("siddipet", "siddipet", 502103, "TS")));
		
	 	List<User> emp=list.stream().filter(a -> a.getSalary()> 20.00 && a.getAddress().getCity().equals("hyd")).toList();
	emp.forEach(a->{
		System.out.println(a.getAge());
	});
	
	}
}
