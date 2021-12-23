
public class Employee {
	private long empID;
	private String name,address,phone;
	private boolean salarypaid;
	public long getEmpID() {
		return empID;
		
	}
	public Employee(long empID, String name) {
		super();
		this.empID = empID;
		this.name = name;
	}
	
	public Employee() {
		super();
	}
	public void setEmpID(long empID) {
		this.empID = empID;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isSalarypaid() {
		return salarypaid;
	}
	public void setSalarypaid(boolean salarypaid) {
		this.salarypaid = salarypaid;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", salarypaid=" + salarypaid + ", getEmpID()=" + getEmpID() + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + ", isSalarypaid()=" + isSalarypaid()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
