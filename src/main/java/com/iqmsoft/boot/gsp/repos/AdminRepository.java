package com.iqmsoft.boot.gsp.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iqmsoft.boot.gsp.model.Admin;



public interface AdminRepository extends MongoRepository<Admin, String>{

}
