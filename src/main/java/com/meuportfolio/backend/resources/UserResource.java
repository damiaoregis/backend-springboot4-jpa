package com.meuportfolio.backend.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meuportfolio.backend.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
    public ResponseEntity<User>findAll(){
    	User u = new User(1L, "Jo","jo@boll.com","6666666","12345" );
    	return ResponseEntity.ok().body(u);
    }
}
