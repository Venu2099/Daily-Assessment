package com.example.demo.Controller;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelComeController {
 
    @GetMapping("/")
    public String greeting(Authentication authentication) {
 
        String userName = authentication.name();
 
        return "Spring Security In-memory Authentication Example - Welcome " + userName;
    }
}