package com.antoniocrocha.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.antoniocrocha.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
