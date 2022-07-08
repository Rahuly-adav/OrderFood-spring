package com.orderfood.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Document(collection="person")
public class Person {
	@Override
	public String toString() {
		return "Person [id=" + id + ", email=" + email + ", phoneNumber=" + phoneNumber + ", type=" + type
				+ ", paymentInfo=" + paymentInfo + ", discount=" + discount + "]";
	}
	@Id
	private String id;
	
	private String email;
	private int phoneNumber;
	private int type;
	private String paymentInfo;
	@DBRef
	private List<Discount> discount;
	
	
	
	public Person(String id, String email, int phoneNumber, int type, String paymentInfo, List<Discount> discount) {
		super();
		this.id = id;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.type = type;
		this.paymentInfo = paymentInfo;
		this.discount = discount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(String paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	public List<Discount> getDiscount() {
		return discount;
	}
	public void setDiscount(List<Discount> discount) {
		this.discount = discount;
	}
	
}
