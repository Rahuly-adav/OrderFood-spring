package com.orderfood.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("discount")
public class Discount {
	
	@Id
	private String id;
	
	private String startDate;
	private int discountAmount;
	private int discountPercentage;
	private String endDate;
	
	@DBRef
	private List<Person> personList;
	
	

	public Discount() {
	}

	public Discount(String id, String startDate, int discountAmount, int discountPercentage, String endDate,
			List<Person> personList) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.discountAmount = discountAmount;
		this.discountPercentage = discountPercentage;
		this.endDate = endDate;
		this.personList = personList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	public int getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
	
}
