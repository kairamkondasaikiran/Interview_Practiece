package kloudGin;

public class CompanyHierarchy {

	 public static void main(String[] args) {
	        // Creating employees
	        Employee emp1 = new Employee("Alice");
	        Employee emp2 = new Employee("Bob");
	        Employee emp3 = new Employee("Charlie");
	        Employee emp4 = new Employee("David");

	        // Creating managers
	        Manager manager1 = new Manager("Emma");
	        Manager manager2 = new Manager("Frank");

	        // Adding direct reports to managers
	        manager1.addDirectReport(emp1);
	        manager1.addDirectReport(emp2);
	        manager2.addDirectReport(emp3);
	        manager2.addDirectReport(emp4);

	        // Printing hierarchy
	        printHierarchy(manager1);
	        printHierarchy(manager2);
	    }

	    public static void printHierarchy(Employee employee) {
	        System.out.println("Employee: " + employee.getName());
	        if (employee instanceof Manager) {
	            Manager manager = (Manager) employee;
	            System.out.println("Direct Reports:");
	            for (Employee directReport : manager.getDirectReports()) {
	                System.out.println("- " + directReport.getName());
	                System.out.println("   Colleagues:");
	                for (Employee colleague : directReport.getColleagues()) {
	                    System.out.println("   - " + colleague.getName());
	                }
	            }
	        }
	    }
}
