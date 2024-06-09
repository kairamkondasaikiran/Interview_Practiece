package kloudGin;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

	private List<Employee> directReports;

    public Manager(String name) {
        super(name);
        this.directReports = new ArrayList<>();
    }

    public void addDirectReport(Employee employee) {
        directReports.add(employee);
        employee.setManager(this);
    }

    public List<Employee> getDirectReports() {
        return directReports;
    }

}
