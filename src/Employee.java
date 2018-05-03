
public class Employee implements Comparable<Employee> {
	
	String name = "";
	int rollNumber = 0;
	String phoneNumber = "";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public int compareTo(Employee o) {
		int comparerollNumber = o.getRollNumber();
		return this.getRollNumber()-comparerollNumber;
	}
	

}
