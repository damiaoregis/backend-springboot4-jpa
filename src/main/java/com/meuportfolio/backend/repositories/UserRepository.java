package com.meuportfolio.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuportfolio.backend.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
