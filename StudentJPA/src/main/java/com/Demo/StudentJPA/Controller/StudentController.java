package com.Demo.StudentJPA.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.StudentJPA.DTO.StudDto;
import com.Demo.StudentJPA.Service.StudentService;

@RestController
public class StudentController {
	
	StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@PostMapping("/studcreate")
	public ResponseEntity<StudDto>createStud(@RequestBody StudDto s)
	{
		return new ResponseEntity<StudDto>(service.inserRec(s),HttpStatus.CREATED);
		
	}
}
