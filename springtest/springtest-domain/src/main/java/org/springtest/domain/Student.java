/*
 */
package org.springtest.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.msgpack.annotation.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Message
@Entity
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final Logger log = LoggerFactory.getLogger(Student.class);

	// Raw attributes
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private Integer sex;

	public Student() {
		super();
	}

	public Student(Long id, String name, Integer sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student id(Long id) {
		setId(id);
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student name(String name) {
		setName(name);
		return this;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Student sex(Integer sex) {
		setSex(sex);
		return this;
	}


	public Student copyRedis() {
		Student student = new Student();
		student.setId(this.getId());
		student.setName(this.getName());
		student.setSex(this.getSex());
		return student;
	}

}