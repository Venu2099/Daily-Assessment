package com.example.demo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface EmployeeRespository {

@Repository
	public interface EmployeeRepository extends JpaRepository<Employee, Long> {
		@Query("SELECT u FROM Employee u WHERE u.phone =5445457")
		Collection<Employee> findAllPhones();

		@Query(value = "SELECT * FROM EMPLOYEE u WHERE u.name = 'binnu'", nativeQuery = true)
		Collection<Employee> findAllName();

		List<Employee> findAllByAddress(Iterable<String> address);
	}
}
