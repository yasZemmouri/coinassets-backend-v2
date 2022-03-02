package com.coinassets.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coinassets.backend.exceptions.ResourceNotFoundException;
import com.coinassets.backend.models.Users;
import com.coinassets.backend.repositories.UsersRepository;

@RestController
@RequestMapping("/api/v1")
public class UsersController {
	@Autowired
	private UsersRepository userRepo;
	@GetMapping("/allusers")
	public List<Users> getAllUsers(){
		return userRepo.findAll();
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<Users> getUserById(@PathVariable int id){
		Users user = userRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("User not found."));
		return ResponseEntity.ok(user);
	}
}