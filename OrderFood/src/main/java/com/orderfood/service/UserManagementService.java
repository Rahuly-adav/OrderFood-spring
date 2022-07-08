package com.orderfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderfood.dao.DiscountRepository;
import com.orderfood.dao.PersonDetailDao;
import com.orderfood.model.Discount;
import com.orderfood.model.Person;

@Service
public class UserManagementService {
	
	@Autowired
	PersonDetailDao userRepo;
	
	@Autowired
	DiscountRepository discountRepo;
	
	public void createNewUser(Person user) {
		userRepo.save(user);
	}
	
	public void createDiscount(Discount dis) {
		discountRepo.save(dis);
	}
	
	public List<Person> getAllUser(){
		List<Person> list = userRepo.findAll();
		return list;
	}
	
	public List<Discount> getAllDiscount(){
		return discountRepo.findAll();
	}
}
