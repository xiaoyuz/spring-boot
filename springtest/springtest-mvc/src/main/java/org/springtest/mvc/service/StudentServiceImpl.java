package org.springtest.mvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springtest.domain.Student;
import org.springtest.jpa.StudentJpaRepository;

@Component("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentJpaRepository studentJpaRepository;
	
//	@Autowired
//	public StudentServiceImpl(StudentJpaRepository studentJpaRepository) {
//		this.studentJpaRepository = studentJpaRepository;
//	}
	
	public int add(Student student) {
		studentJpaRepository.save(student);
		return 1;
	}
	
	public Student getById(Long id) {
		return studentJpaRepository.findOne(id);
	}

}
