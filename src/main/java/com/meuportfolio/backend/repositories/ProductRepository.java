package com.meuportfolio.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuportfolio.backend.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
