package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesCurrenciesRepo extends JpaRepository<CountriesCurrencies, Long> {

}
