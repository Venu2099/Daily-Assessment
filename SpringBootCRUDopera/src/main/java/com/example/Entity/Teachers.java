package com.example.Entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teachers implements Serializable {
	 
    /**
     * 
     */
    private static final long serialVersionUID = 7144115798199856451L;
	
	@Id
	@Column(name = "TeachersId")
	private long TeachersId;

	@Column(name = "name")
	private String name;

	public long getTeachersId() {
		return TeachersId;
	}

	public void setTeachersId(long teachersId) {
		TeachersId = teachersId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(TeachersId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teachers other = (Teachers) obj;
		return TeachersId == other.TeachersId && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Teachers [TeachersId=" + TeachersId + ", name=" + name + "]";
	}
	
	

}
