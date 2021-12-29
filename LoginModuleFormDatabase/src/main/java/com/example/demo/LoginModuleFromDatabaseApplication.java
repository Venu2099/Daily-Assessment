package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
 
@SpringBootApplication
@EnableJpaAuditing
public class LoginModuleFromDatabaseApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(LoginModuleFromDatabaseApplication.class, args);
    }
 
}