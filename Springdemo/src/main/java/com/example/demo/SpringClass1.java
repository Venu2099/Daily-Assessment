package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class SpringClass1 {
	@Value("${myname}")
    //@Value("myname")
    private String name;

    @GetMapping("/")
    public String greeting() {
        return name + "Wel Come to Microservices";
}
}
