package com.test.firstspringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@Document
public class Student {

//	@Id
//	private String id;

	@Id
	@GeneratedValue
	private long id;

//	@Column(name="student_name")
	private String name;

	private int rollno;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Student() {

	}

	public Student(long id, String string, int rollno) {
		super();
		this.id = id;
		this.name = string;
		this.rollno = rollno;
	}

}
