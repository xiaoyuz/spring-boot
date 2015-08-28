package org.springtest.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springtest.domain.Student;
import org.springtest.redis.StudentRedisRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRedisRepository studentRedisRepository;
	
	public int add(Student student) {
		studentRedisRepository.add(student);
		return 1;
	}
	
	public Student getById(Long id) {
		return studentRedisRepository.getById(id);
	}

}
