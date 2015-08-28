package org.springtest.mvc.service;

import org.springtest.domain.Student;

public interface StudentService {
	
	public int add(Student student);
	
	public Student getById(Long id);

}
