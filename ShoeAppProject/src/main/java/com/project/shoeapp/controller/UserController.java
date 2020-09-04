package com.project.shoeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.shoeapp.model.User;
import com.project.shoeapp.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping(value = "user", consumes = "application/json")
	public User createUser(@RequestBody User user) {
		return service.createUser(user);
	}
}
