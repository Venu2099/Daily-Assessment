package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private MyService myService;
    @GetMapping("/")
    public String greeting() {
        return "Hello World";
    }
    @PostMapping("/")
    public String addRecord(@RequestBody Employee employee) {
        myService.addEmployee(employee);
        return "done";
    }
}