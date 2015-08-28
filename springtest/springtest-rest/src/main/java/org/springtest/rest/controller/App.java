package org.springtest.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springtest.domain.Student;
import org.springtest.rest.service.StudentService;

@Controller
public class App {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		Student student = new Student();
		student.setId(9l);
		student.setName("aele");
		student.setSex(1);
		
		studentService.add(student);
		
		return String.valueOf(student);
	}
	
}