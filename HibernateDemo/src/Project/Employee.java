package Project;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee implements Serializable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 111;
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="EmpID")
    private String empID;

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", hashCode()=" + hashCode() + ", getEmpID()=" + getEmpID()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empID == other.empID;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String string) {
		this.empID = string;
	}

	public void setEmpAddress(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setEmpContact(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		
	}
}