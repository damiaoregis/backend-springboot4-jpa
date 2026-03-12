package com.meuportfolio.backend.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.meuportfolio.backend.entities.Category;
import com.meuportfolio.backend.entities.Order;
import com.meuportfolio.backend.entities.Product;
import com.meuportfolio.backend.entities.User;
import com.meuportfolio.backend.entities.enums.OrderStatus;
import com.meuportfolio.backend.repositories.CategoryRepository;
import com.meuportfolio.backend.repositories.OrderRepository;
import com.meuportfolio.backend.repositories.ProductRepository;
import com.meuportfolio.backend.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
 
	@Autowired
	private UserRepository userRepository;
 
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
    private CategoryRepository categoryRepository;
	
	@Autowired
    private ProductRepository productRepository;
  
	@Override
  public void run(String... args) throws Exception {
		User u = new User(null, "Bart Allen","bart@boll.com","6549876","152345" );
		User u1 = new User(null, "Ires West","ires@boll.com","3221656","12345" );
		
	    
		Order o1 = new Order(null, Instant.parse("2026-02-12T15:29:36z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2026-02-22T15:25:36z"), OrderStatus.DELIVERED, u);
		Order o3 = new Order(null, Instant.parse("2026-02-26T05:52:37z"), OrderStatus.SHIPPED, u);
		
		Category c1 = new Category(null, "Electronics");
		Category c2 = new Category(null, "Books");
		Category c3 = new Category(null, "Cmputers");
		
		Product p1 = new Product(
			    null,
			    "The Lord of the Rings",
			    "Ultrabook leggero e potente con display InfinityEdge.",
			    89.30,
			    "https://example.com/images/dell-xps13.jpg"
			);

			Product p2 = new Product(
			    null,
			    "Smartphone Samsung Galaxy S24",
			    "Smartphone di ultima generazione con fotocamera avanzata.",
			    5999.00,
			    "https://example.com/images/galaxy-s24.jpg"
			);

			Product p3 = new Product(
			    null,
			    "Cuffie Sony WH-1000XM5",
			    "Cuffie wireless con cancellazione del rumore leader di mercato.",
			    1999.50,
			    "https://example.com/images/sony-wh1000xm5.jpg"
			);

			Product p4 = new Product(
			   null,
			    "Monitor LG UltraWide 34''",
			    "Monitor curvo ultrawide per produttività e gaming.",
			    3499.99,
			    "https://example.com/images/lg-ultrawide.jpg"
			);

			Product p5 = new Product(
			    null,
			    "Apple iPad Pro 12.9",
			    "Tablet professionale con chip M2 e display Liquid Retina.",
			    7999.00,
			    "https://example.com/images/ipad-pro.jpg"
			);
		userRepository.saveAll(Arrays.asList(u,u1));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		categoryRepository.saveAll(Arrays.asList(c1,c2,c3));
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
  }
  
}
