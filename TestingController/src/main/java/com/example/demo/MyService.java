package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	private EmployeeRepository empRepo;

	public Employee addEmployee(Employee employee) {

		return employee;
	}

	public EmployeeRepository getEmpRepo() {
		return empRepo;
	}

	public void setEmpRepo(EmployeeRepository empRepo) {
		this.empRepo = empRepo;
	}

}