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

import com.example.Entity.Courses;
import com.example.Repository.CoursesRepository;



@RestController
@RequestMapping("/Courses")
public class CoursesController {
	@Autowired
	private CoursesRepository couRepo;

	@PostMapping("/")
	public Courses addCourses(@RequestBody Courses cou) {
		return couRepo.save(cou);
	}

	@GetMapping("/")
	public List<Courses> listCourses() {
		return couRepo.findAll();
	}

	@PutMapping("/")
	public Courses updateCourses(@RequestBody Courses cou) {
		return couRepo.save(cou);
	}

	@DeleteMapping("/")
	public String deleteCourses(@RequestBody Courses cou) {
		couRepo.delete(cou);
		return "Deleted Courses";
	}

}
