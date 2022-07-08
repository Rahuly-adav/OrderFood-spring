package com.orderfood.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.orderfood.model.Person;

@EnableMongoRepositories
public interface PersonDetailDao extends MongoRepository<Person, Integer> {
}
