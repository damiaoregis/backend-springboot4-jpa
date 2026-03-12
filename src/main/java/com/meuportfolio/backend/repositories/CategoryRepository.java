package com.meuportfolio.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuportfolio.backend.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
