package org.springtest.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springtest.domain.Student;
import org.springtest.rest.service.StudentService;

@RestController
public class RestTest {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/getstu")
	public Student getStudent(@RequestParam(value="id", defaultValue="1") long id) {
		return studentService.getById(id);
	}

}
