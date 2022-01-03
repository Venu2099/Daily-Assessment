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

import com.example.Entity.Teachers;
import com.example.Repository.TeachersRepository;

@RestController
@RequestMapping("/Teacher")
public class TeachersController {
	@Autowired
	private TeachersRepository teaRepo;

	@PostMapping("/")
	public Teachers addTeacher(@RequestBody Teachers tea) {
		return teaRepo.save(tea);
	}

	@GetMapping("/")
	public List<Teachers> listTeacher() {
		return teaRepo.findAll();
	}

	@PutMapping("/")
	public Teachers updateTeacher(@RequestBody Teachers tea) {
		return teaRepo.save(tea);
	}

	@DeleteMapping("/")
	public String deleteTeacher(@RequestBody Teachers tea) {
		teaRepo.delete(tea);
		return "Deleted Teacher";
	}
}
