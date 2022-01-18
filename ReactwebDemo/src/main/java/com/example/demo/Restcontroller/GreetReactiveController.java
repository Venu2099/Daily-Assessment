package com.example.demo.Restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Person;

import reactor.core.publisher.Flux;

@RestController
public class GreetReactiveController {
    @GetMapping("/greetings")
    public Flux<Person> greetingPublisher() {
    	Person p=new Person();
    	 p.setName("Venu PUPPALA");
         p.setAddress("Visakhapatnam");
         p.setPhone("8888855555");
         Flux<Person> greetingFlux = Flux.<Person>generate(sink -> sink.next(p)).take(10);
         return greetingFlux;
    }
}
