package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Laptop;
import com.example.demo.repository.LaptopRepository;

 
@RestController
@RequestMapping("/laptop")
public class LaptopRestController {
    @Autowired
    private LaptopRepository laptopRepository;

    @PostMapping("/")
    public Laptop addLaptop(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);
    }
    @GetMapping("/")
    public List<Laptop> listLaptop() {
        return laptopRepository.findAll();
    }
    @PutMapping("/")
    public Laptop updateLaptop(@RequestBody Laptop laptop) {
    	return laptopRepository.save(laptop);
    }
    @DeleteMapping("/")
    public String deleteLaptop(@RequestBody Laptop laptop) {
    	 laptopRepository.delete(laptop);
    	 return "deleteddata";
    }
}