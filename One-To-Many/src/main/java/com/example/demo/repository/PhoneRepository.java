package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Phone;
 
@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long>{
 
}