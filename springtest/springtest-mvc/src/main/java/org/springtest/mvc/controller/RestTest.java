package org.springtest.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springtest.domain.Student;
import org.springtest.mvc.service.StudentService;
import org.springtest.mvc.service.StudentServiceImpl;

@Controller
public class RestTest {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/getstu")
	public ModelAndView getStudent(@RequestParam(value="id", defaultValue="1") long id) {
		
		Student student = studentService.getById(id);
		ModelAndView modelAndView = new ModelAndView("index", "student", student);
		return modelAndView;
	}
	
	@RequestMapping("/get")
	public String get(@RequestParam(value="id", defaultValue="1") long id) {
		
		return "index";
	}

}
