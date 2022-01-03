package com.example.Entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student implements Serializable {
	 
    /**
     * 
     */
    private static final long serialVersionUID = 7144115798199856451L;
    @Id
    private Long Sid;
    private String name, address;
	public Long getSid() {
		return Sid;
	}
	public void setSid(Long sid) {
		Sid = sid;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Sid, address, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Sid, other.Sid) && Objects.equals(address, other.address)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", name=" + name + ", address=" + address + "]";
	}
    
    
}
