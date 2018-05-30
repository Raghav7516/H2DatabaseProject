package com.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class StudentController {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@GetMapping("/domy")
	public  String    get() {
		return "working";
	}

	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student) {
		studentRepo.save(student);
		return "data inserted";
	}
}
