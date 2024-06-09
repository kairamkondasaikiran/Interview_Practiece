package splanLabs;

public class Address {

	private String city;
	private String dist;
	private int pincode;
	private String state;
	
	public Address(String city, String dist, int pincode, String state) {
		super();
		this.city = city;
		this.dist = dist;
		this.pincode = pincode;
		this.state = state;
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
