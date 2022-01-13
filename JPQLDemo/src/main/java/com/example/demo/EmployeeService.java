package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeRespository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmpList(Example<Employee> employee){
        //return employeeRepository.findAll(employee);
        //return employeeRepository.findAll(Sort.by(So    rt.Direction.ASC, "name"));
        //return employeeRepository.findAll(Sort.by("phone"));
        //return employeeRepository.findAll(Sort.by("LENGTH(address)"));
        return employeeRepository.findAll(JpaSort.unsafe("LENGTH(address)"));

    }
}