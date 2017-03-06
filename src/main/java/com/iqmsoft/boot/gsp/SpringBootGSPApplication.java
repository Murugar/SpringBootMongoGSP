package com.iqmsoft.boot.gsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.iqmsoft.boot.gsp.model.Admin;
import com.iqmsoft.boot.gsp.repos.AdminRepository;

@Configuration
@EnableAutoConfiguration
@EnableMongoRepositories
@SpringBootApplication
@ComponentScan
public class SpringBootGSPApplication implements CommandLineRunner {

	@Autowired
	private AdminRepository arepos;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootGSPApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		
		if(arepos.findAll().isEmpty())
		{
			arepos.save(new Admin("admin", "admin"));
			arepos.save(new Admin("user", "user"));
		}
		
	}
}
