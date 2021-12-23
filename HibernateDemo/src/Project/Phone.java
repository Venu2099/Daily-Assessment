package Project;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long phoneId;
    private String phoneNumber, type;
	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneNumber=" + phoneNumber + ", type=" + type + ", hashCode()="
				+ hashCode() + ", getPhoneId()=" + getPhoneId() + ", getPhoneNumber()=" + getPhoneNumber()
				+ ", getType()=" + getType() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(phoneId, phoneNumber, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return Objects.equals(phoneId, other.phoneId) && Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(type, other.type);
	}
	public Long getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(Long phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
