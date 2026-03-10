package com.meuportfolio.backend.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.meuportfolio.backend.entities.User;
import com.meuportfolio.backend.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
 
	@Autowired
	private UserRepository userRepository;

  @Override
  public void run(String... args) throws Exception {
		User u = new User(null, "Bart Allen","bart@boll.com","6549876","152345" );
		User u1 = new User(null, "Ires West","ires@boll.com","3221656","12345" );
		
		userRepository.saveAll(Arrays.asList(u,u1));
	
  }
  
}
