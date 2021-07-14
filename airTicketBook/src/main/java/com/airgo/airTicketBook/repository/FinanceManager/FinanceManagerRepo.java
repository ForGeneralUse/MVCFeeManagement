package com.airgo.airTicketBook.repository.FinanceManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airgo.airTicketBook.Entity.FinanceManager.FinanceManager;
import com.airgo.airTicketBook.Entity.Student.Student;


@Repository
public interface FinanceManagerRepo extends JpaRepository<FinanceManager, Integer> {
	

}
