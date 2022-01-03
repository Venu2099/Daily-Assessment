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

import com.example.demo.model.Dates;
import com.example.demo.repository.DatesRepository;



@RestController
@RequestMapping("/date")
public class DatesRestController {
	@Autowired
	private DatesRepository datesRepository;

	@PostMapping("/add")
	public Dates addDate(@RequestBody Dates date) {
		return datesRepository.save(date);
	}

	@GetMapping("/list")
	public List<Dates> listDates() {
		return datesRepository.findAll();
	}

	@PutMapping("/update")
	public Dates updateDate(@RequestBody Dates date) {
		return datesRepository.save(date);
	}

	@DeleteMapping("/delete")
	public String deleteDate(@RequestBody Dates date) {
		datesRepository.delete(date);
		return "Deleted Date of DateId : " + Dates.getSerialversionuid();
	}
}
