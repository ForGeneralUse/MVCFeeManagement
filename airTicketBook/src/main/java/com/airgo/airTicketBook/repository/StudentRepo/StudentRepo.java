package com.airgo.airTicketBook.repository.StudentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airgo.airTicketBook.Entity.Student.Student;



public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	
}
