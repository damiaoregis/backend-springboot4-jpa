package com.meuportfolio.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuportfolio.backend.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
