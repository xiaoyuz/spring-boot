/*
 */
package org.springtest.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springtest.domain.Student;
import org.springtest.redis.support.StudentByteRedisTemplate;

@Repository
public class StudentRedisRepository {
	
	private final static String KEY_PREF = "STU";
	
	private StudentByteRedisTemplate stringByteRedisTemplate;
	
	@Autowired
	public StudentRedisRepository(StudentByteRedisTemplate template) {
		this.stringByteRedisTemplate = template;
	}
	
	public void add(Student student) {
		
		stringByteRedisTemplate.opsForHash().put(KEY_PREF, String.valueOf(student.getId()), student);
	}
	
	public Student getById(Long id) {
		return (Student) stringByteRedisTemplate.opsForHash().get(KEY_PREF, String.valueOf(id));
	}
	
}