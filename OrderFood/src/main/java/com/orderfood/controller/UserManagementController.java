package com.orderfood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderfood.model.Person;
import com.orderfood.service.UserManagementService;

@RestController
public class UserManagementController {
	
	@Autowired
	UserManagementService ums;
	
	@GetMapping("/allUser")
	public List<Person> getAllUser(){
		return ums.getAllUser();
	}
	
	@PostMapping("/newUser")
	public void createUser(Person user) {
		ums.createNewUser(user);
	}
}
