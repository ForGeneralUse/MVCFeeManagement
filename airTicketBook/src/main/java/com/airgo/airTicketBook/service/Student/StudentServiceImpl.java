package com.airgo.airTicketBook.service.Student;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airgo.airTicketBook.Entity.Student.Student;
import com.airgo.airTicketBook.repository.StudentRepo.StudentRepo;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Optional<Student> findById(Integer id) {
		return studentRepo.findById(id);
	}
	

}
