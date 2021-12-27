package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;

import com.example.demo.repository.*;
@RestController
@RequestMapping("/Employee")
public class EmpleoyeeRestController {
	@Autowired
	    private EmployeeRepository employeeRepository;

	    @PostMapping("/")
	    public Employee addEmployee(@RequestBody Employee employee) {
	        return employeeRepository.save(employee);
	    }
	    @GetMapping("/")
	    public List<Employee> listEmployee() {
	        return employeeRepository.findAll();
	    }
	    @PutMapping("/")
	    public Employee updateEmployee(@RequestBody Employee employee) {
	        return employeeRepository.save(employee);
	        
	    }
	    @DeleteMapping("/")
	    public String deleteEmployee(@RequestBody Employee employee) {
	    	 employeeRepository.delete(employee);
	    	 return "deleteddata";

	}
}

