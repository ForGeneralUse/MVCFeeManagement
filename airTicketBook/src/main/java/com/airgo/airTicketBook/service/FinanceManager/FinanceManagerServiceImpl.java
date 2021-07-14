package com.airgo.airTicketBook.service.FinanceManager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airgo.airTicketBook.Entity.FinanceManager.FinanceManager;
import com.airgo.airTicketBook.Entity.Student.Student;
import com.airgo.airTicketBook.repository.FinanceManager.FinanceManagerRepo;


@Service
public class FinanceManagerServiceImpl implements FinanceManagerService{

	@Autowired
	private FinanceManagerRepo financeManagerRepo;

	@Override
	public Optional<Student> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Student student, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
