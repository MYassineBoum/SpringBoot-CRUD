package com.studentsCRUD.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentsCRUD.students.model.Student;
import com.studentsCRUD.students.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public Iterable<Student> getStudents() {
		return studentService.getStudents();
	}
	
}
