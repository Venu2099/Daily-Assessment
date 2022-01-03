package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Student;
import com.example.Repository.StudentRepository;



@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	private StudentRepository stuRepo;

	@PostMapping("/")
	public Student addStudent(@RequestBody Student stu) {
		return stuRepo.save(stu);
	}

	@GetMapping("/")
	public List<Student> listStudent() {
		return stuRepo.findAll();
	}

	@PutMapping("/")
	public Student updateStudent(@RequestBody Student stu) {
		return stuRepo.save(stu);
	}

@DeleteMapping("/")
public String deleteStudent(@RequestBody Student stu) {
stuRepo.delete(stu);
return "Deleted Student";
}
}
