package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Dates;

@Repository
public interface DatesRepository extends JpaRepository<Dates, Integer>{

}
