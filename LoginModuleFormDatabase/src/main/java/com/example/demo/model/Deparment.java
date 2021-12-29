package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deparment  extends AuditModel implements Serializable{
 
    /**
     * 
     */
    private static final long serialVersionUID = -1606169901038082721L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dptID;
    private Long deptName;
	public Long getDeptName() {
		return deptName;
	}
	public void setDeptName(Long deptName) {
		this.deptName = deptName;
	}
}