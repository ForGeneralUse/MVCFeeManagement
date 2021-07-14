package com.airgo.airTicketBook.service.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airgo.airTicketBook.Entity.User.User;
import com.airgo.airTicketBook.repository.user.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired 
	UserRepo userRepo; 
	
	@Override
	public User save(User user) {
		return userRepo.save(user);
	}


	@Override
	public User updateUser(User user, Integer userId) {
		user.setId(userId);
		 return userRepo.save(user);
	}


	@Override
	public Optional<User> findById(Integer userId) {
		return userRepo.findById(userId);
	}


	@Override
	public void delete(Integer userId) {
		userRepo.deleteById(userId);
	}

}

