package kloudGin;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	  private String name;
	    private Employee manager;
	    private List<Employee> colleagues;

	    public Employee(String name) {
	        this.name = name;
	        this.colleagues = new ArrayList<>();
	    }

	    public String getName() {
	        return name;
	    }

	    public void setManager(Employee manager) {
	        this.manager = manager;
	    }

	    public Employee getManager() {
	        return manager;
	    }

	    public void addColleague(Employee colleague) {
	        colleagues.add(colleague);
	    }

	    public List<Employee> getColleagues() {
	        return colleagues;
	    }
}
