package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Entity.Teachers;

public interface TeachersRepository extends JpaRepository<Teachers, Long>{
	
}
