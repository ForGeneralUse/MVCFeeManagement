package com.airgo.airTicketBook.controller.FinanceManager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airgo.airTicketBook.Entity.Student.Student;
import com.airgo.airTicketBook.service.FinanceManager.FinanceManagerService;

@RestController
public class FinanaceManagerController {
	
	@Autowired
	private FinanceManagerService financeManagerService;
	
	@GetMapping("/student/{id}")
	public Optional<Student> find(@PathVariable("id") Integer id) {
		return financeManagerService.findById(id);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return financeManagerService.findAll();
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return financeManagerService.save(student);
	}
	
	@PutMapping("/student/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable Integer id) {
		return financeManagerService.updateStudent(student, id);
	}
	
	@DeleteMapping("/student")
	public void removeStudent(@RequestBody Student student) {
		financeManagerService.delete(student);
	}
	

}
