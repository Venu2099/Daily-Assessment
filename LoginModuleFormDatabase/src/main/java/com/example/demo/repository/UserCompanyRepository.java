package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CompanyUser;

@Repository
public interface UserCompanyRepository extends JpaRepository<CompanyUser,Long>{
 
}
