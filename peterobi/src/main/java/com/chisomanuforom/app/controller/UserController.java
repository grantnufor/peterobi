package com.chisomanuforom.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chisomanuforom.app.entity.User;
import com.chisomanuforom.app.service.UserService;


@RestController
@RequestMapping("/User")
public class UserController {
	
	
	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	@GetMapping
	public List<User> getUsers(){
		
		return userService.getUsers();
		
	}
	
	

	
	@GetMapping("/{userId}")
	public Optional<User> getUserByUserId(@PathVariable long userId)
	{
		return userService.getUserById(userId);	
		
	}
	
	
	
	@GetMapping("getByEmail/{emailAddress}/{password}")
	public Optional<User> getUserByEmailAddressAndPassword(@PathVariable String emailAddress, @PathVariable String password)
	{
		return userService.getUserByEmailAddressAndPassword(emailAddress, password);	
		
	}
	
	
	@GetMapping("/{phoneNumber}/{password}")
	public Optional<User> getUserByPhoneNumberAndPassword(@PathVariable String phoneNumber, @PathVariable String password)
	{
		return userService.getUserByPhoneNumberAndPassword(phoneNumber, password);	
		
	}
	
	
	@PostMapping
	public void registerUser(@RequestBody User user) {
		
		userService.addUser(user);
		
	}
	
	
	
	@PostMapping("/{userId}")
	public String deleteUser(@PathVariable long userId) {
		
		userService.deleteUser(userId);
		
		return "User has been deleted with id ="+userId;
		
	}
	
	
	


}
