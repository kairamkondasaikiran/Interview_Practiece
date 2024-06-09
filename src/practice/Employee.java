package practice;

public class  Employee  {

	private String name;
	private int age;
	private double salary;
	private String dept;
	private int deptId;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	
	public Employee(String name, int age, double salary, String dept, int deptId) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", dept=" + dept + ", deptId="
				+ deptId + "]";
	}
	
	
}
