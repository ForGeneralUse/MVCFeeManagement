package com.airgo.airTicketBook.service.user;

import java.util.Optional;

import com.airgo.airTicketBook.Entity.User.User;



public interface UserService {

	public User save(User user);

	public User updateUser(User user, Integer userId);

	public Optional<User> findById(Integer userId);

	public void delete(Integer userId);
}
