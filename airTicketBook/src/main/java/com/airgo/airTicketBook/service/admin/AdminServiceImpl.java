package com.airgo.airTicketBook.service.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airgo.airTicketBook.Entity.admin.Admin;
import com.airgo.airTicketBook.repository.admin.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepo adminRepo;

	@Override
	public boolean getAdmin(String id, String password) {
		if (adminRepo.findById(id).get() != null) {

			Admin admin = adminRepo.findById(id).get();
			if (admin.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
