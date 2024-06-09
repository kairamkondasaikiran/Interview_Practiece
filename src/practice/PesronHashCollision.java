package practice;

import java.util.Objects;

public class PesronHashCollision {

	private int id;
	private String name;
	private String address;
	private String dpet;
	private double salary;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDpet() {
		return dpet;
	}
	public void setDpet(String dpet) {
		this.dpet = dpet;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public PesronHashCollision(int id, String name, String address, String dpet, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dpet = dpet;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "PesronHashCollision [id=" + id + ", name=" + name + ", address=" + address + ", dpet=" + dpet
				+ ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		int a=1;
		return a;
	}

	
}
