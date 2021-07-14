package com.airgo.airTicketBook.service.Student;

import java.util.Optional;
import com.airgo.airTicketBook.Entity.Student.Student;


public interface StudentService {
	
	Optional<Student> findById(Integer id);
}
