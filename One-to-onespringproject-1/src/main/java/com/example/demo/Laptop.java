package com.example.demo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


 
@Entity
public class Laptop implements Serializable{
 
    /**
     * 
     */
    private static final long serialVersionUID = 7144115798199856451L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lid;
    private String model,brand,cpu;
	public Long getLid() {
		return lid;
	}
	public void setLid(Long lid) {
		this.lid = lid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	
    
    
}
