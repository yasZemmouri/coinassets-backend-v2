package com.coinassets.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coinassets.backend.models.Users;
import com.coinassets.backend.repositories.UsersRepository;

@RestController
@RequestMapping("/api/v1/")
public class UsersController {
	@Autowired
	private UsersRepository userRepo;
	@GetMapping("/allusers")
	public List<Users> getAllUsers(){
		return userRepo.findAll();
	}

}
