package com.airgo.airTicketBook.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airgo.airTicketBook.Entity.Student.Student;
import com.airgo.airTicketBook.Entity.User.User;


@Repository
public interface UserRepo  extends JpaRepository<User, Integer>{

}

