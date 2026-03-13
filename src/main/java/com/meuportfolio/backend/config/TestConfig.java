package com.meuportfolio.backend.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.meuportfolio.backend.entities.Category;
import com.meuportfolio.backend.entities.Order;
import com.meuportfolio.backend.entities.OrderItem;
import com.meuportfolio.backend.entities.Payment;
import com.meuportfolio.backend.entities.Product;
import com.meuportfolio.backend.entities.User;
import com.meuportfolio.backend.entities.enums.OrderStatus;
import com.meuportfolio.backend.repositories.CategoryRepository;
import com.meuportfolio.backend.repositories.OrderItemRepository;
import com.meuportfolio.backend.repositories.OrderRepository;
import com.meuportfolio.backend.repositories.ProductRepository;
import com.meuportfolio.backend.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private OrderItemRepository orderItemRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {

		Category c1 = new Category(null, "Electronics");
		Category c2 = new Category(null, "Books");
		Category c3 = new Category(null, "Computers");

		Product p1 = new Product(null, "The Lord of the Rings", "Uleggero e potente con display InfinityEdge.", 90.50,
				"https://example.com/images/dell-xps13.jpg");

		Product p2 = new Product(null, "SmartTv Samsung 24", "Smarttv di ultima generazione con fotocamera avanzata.",
				2190.00, "https://example.com/images/galaxy-s24.jpg");

		Product p3 = new Product(null, "MacBook", "cdada rumore leader di mercato.", 1250.50,
				"https://example.com/images/sony-wh1000xm5.jpg");

		Product p4 = new Product(null, "PC Gamer", "Loren or curvo ultrawide per produttività e gaming.", 3499.99,
				"https://example.com/images/lg-ultrawide.jpg");

		Product p5 = new Product(null, "Rails for Dummies", "Loren iprofessionale con chip M2 e display Liquid Retina.",
				7999.00, "https://example.com/images/ipad-pro.jpg");
		categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

		p1.getCategories().add(c2);
		p2.getCategories().add(c1);
		p2.getCategories().add(c3);
		p3.getCategories().add(c3);
		p4.getCategories().add(c3);
		p5.getCategories().add(c2);
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

		User u1 = new User(null, "Bart Allen", "bart@boll.com", "6549876", "152345");
		User u2 = new User(null, "Ires West", "ires@boll.com", "3221656", "12345");

		Order o1 = new Order(null, Instant.parse("2026-02-12T15:29:36z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2026-02-22T15:25:36z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2026-02-26T05:52:37z"), OrderStatus.WAITING_PAYMENT, u2);
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

		OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
		OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice());
		OrderItem oi3 = new OrderItem(o2, p3, 2, p3.getPrice());
		OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice());
		orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));

		Payment payment1 = new Payment(null, Instant.parse("2026-02-12T17:29:36z"), o1);
		o1.setPayment(payment1);
		orderRepository.save(o1);
	}

}
