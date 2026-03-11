package com.meuportfolio.backend.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.meuportfolio.backend.entities.Order;
import com.meuportfolio.backend.entities.User;
import com.meuportfolio.backend.repositories.OrderRepository;
import com.meuportfolio.backend.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
 
	@Autowired
	private UserRepository userRepository;
 
	@Autowired
	private OrderRepository orderRepository;

  @Override
  public void run(String... args) throws Exception {
		User u = new User(null, "Bart Allen","bart@boll.com","6549876","152345" );
		User u1 = new User(null, "Ires West","ires@boll.com","3221656","12345" );
		
	    
		Order o1 = new Order(null, Instant.parse("2026-02-12T15:29:36z"), u1);
		Order o2 = new Order(null, Instant.parse("2026-02-22T15:25:36z"), u);
		Order o3 = new Order(null, Instant.parse("2026-02-26T05:52:37z"), u);
		
		userRepository.saveAll(Arrays.asList(u,u1));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
  }
  
}
