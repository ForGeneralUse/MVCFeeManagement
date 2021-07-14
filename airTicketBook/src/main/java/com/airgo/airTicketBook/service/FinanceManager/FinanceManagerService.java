package com.airgo.airTicketBook.service.FinanceManager;

import java.util.List;
import java.util.Optional;

import com.airgo.airTicketBook.Entity.FinanceManager.FinanceManager;
import com.airgo.airTicketBook.Entity.Student.Student;


public interface FinanceManagerService {
	
	Optional<Student> findById(Integer id);
	
	List<Student> findAll();

	Student save(Student student);

	Student updateStudent(Student student, Integer id);

	void delete(Student student);

	
	

}
