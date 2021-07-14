package com.airgo.airTicketBook.controller.Student;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.airgo.airTicketBook.Entity.Student.Student;
import com.airgo.airTicketBook.service.Student.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/student/view/{id}")
	public Optional<Student> getStudent(@PathVariable int id) {
		return studentService.findById(id);
	}

}
