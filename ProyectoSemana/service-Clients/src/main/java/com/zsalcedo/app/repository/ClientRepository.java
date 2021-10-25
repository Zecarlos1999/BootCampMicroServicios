package com.zsalcedo.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zsalcedo.app.entity.Client;
@Repository
public interface ClientRepository  extends MongoRepository<Client, String>{
	
}
