package com.meuportfolio.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuportfolio.backend.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
