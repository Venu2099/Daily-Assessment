package com.example.Entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Courses implements Serializable {
	 
    /**
     * 
     */
    private static final long serialVersionUID = 7144115798199856451L;
	
	@Id
	@Column(name = "CoursesId")
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long CoursesId;

	@Column(name = "name")
	private String name;

	public long getCoursesId() {
		return CoursesId;
	}

	public void setCoursesId(long coursesId) {
		CoursesId = coursesId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CoursesId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Courses other = (Courses) obj;
		return CoursesId == other.CoursesId && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Courses [CoursesId=" + CoursesId + ", name=" + name + "]";
	}
	

}
