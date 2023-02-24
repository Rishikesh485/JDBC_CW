package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class TestDriver {

	public static void main(String[] args) {
		Student s = new Student();
		s.setId(123);
		s.setName("xyz");
		s.setEmail("xyz@123.com");

		StudentDao sd = new StudentDao();
		Student s1 = sd.saveStudent(s);
		System.out.println(s1.getId() + " has been saved");
	}
}
