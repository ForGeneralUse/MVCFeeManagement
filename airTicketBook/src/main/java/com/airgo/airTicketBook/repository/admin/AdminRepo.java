package com.airgo.airTicketBook.repository.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airgo.airTicketBook.Entity.admin.Admin;


@Repository
public interface AdminRepo extends JpaRepository<Admin, String>{
    
	
}
