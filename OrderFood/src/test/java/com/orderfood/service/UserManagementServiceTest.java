package com.orderfood.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.orderfood.service.UserManagementService;


public class UserManagementServiceTest {

	@Autowired
	UserManagementService ums;
	
	@Test
	public void createNewUserTest() {
		//ums.createNewUser(new Person("123","xyz@abc.com",123456789,2,"Credit"));
		System.out.println("hello");
		System.out.println("all users:  "+ ums.getAllUser());
		
	}
}
