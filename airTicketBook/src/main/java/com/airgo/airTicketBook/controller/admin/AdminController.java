package com.airgo.airTicketBook.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.airgo.airTicketBook.service.admin.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/admin/{username}/{password}")
	public boolean getAdmin(@PathVariable("username") String username,
			@PathVariable("password") String password) {
		return adminService.getAdmin(username, password);
	}

}
