package com.airgo.airTicketBook.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airgo.airTicketBook.Entity.User.User;
import com.airgo.airTicketBook.service.user.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/user/{id}")
	User getUser(@PathVariable Integer id) {
		return userService.findById(id).get();
	}

	@PostMapping("/user/add")
	User addUser(@RequestBody User user) {
		User saved = userService.save(user);
		return saved;
	}

	@PutMapping("/user/update/{id}")
	User updateUser(@PathVariable Integer id, @RequestBody User user) {
		User update = userService.updateUser(user, id);
		return update;
	}

	@DeleteMapping("/user/remove/{id}")
	public String deleteUser(@PathVariable Integer id) {
		userService.delete(id);
		return "Deleated";
	}

}
