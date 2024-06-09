package birlasoft;

public class Employee {

	private int id;
	private String name;
	private String role;
	private int deptId;
	private String dept;
	private double salary;
	private int age;
	
	
	public Employee(int id, String name, String role, int deptId, String dept, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.deptId = deptId;
		this.dept = dept;
		this.salary = salary;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", deptId=" + deptId + ", dept=" + dept
				+ ", salary=" + salary + ", age=" + age + "]";
	}
	
	
	
}
