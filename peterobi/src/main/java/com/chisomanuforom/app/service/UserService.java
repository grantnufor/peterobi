package com.chisomanuforom.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chisomanuforom.app.entity.User;
import com.chisomanuforom.app.repository.UserRepository;

@Service
public class UserService {
	
	
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	public List<User> getUsers(){
		
		return userRepository.findAll();
	}
	

	public Optional<User> getUserById(long userId){
		
		return userRepository.findById(userId);
		
	}
	
	
	
	public Optional<User> getUserByPhoneNumberAndPassword(String phoneNumber, String password) {
		
		return userRepository.findUserByPhoneNumberAndPassword(phoneNumber, password);
		
	}
	
	
	public Optional<User> getUserByEmailAddressAndPassword(String emailAddress, String password) {
		
		return userRepository.findUserByEmailAddressAndPassword(emailAddress, password);
		
	}


	public void addUser(User user) {
		
		Optional<User> userByPhoneNumber = userRepository.findUserByPhoneNumber(user.getPhoneNumber());
		
		if(!userByPhoneNumber.isPresent()) {
			
			userRepository.save(user);
			
		}
		else {
			
			throw new IllegalStateException("User with Phone Number "+user.getPhoneNumber()+" already exists.");
			
		}
		
		
	}
	
	
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		Optional<User> userByPhoneNumber = userRepository.findUserByPhoneNumber(user.getPhoneNumber());
		if(userByPhoneNumber.isPresent()) {
			
			userRepository.save(user);
			
		}
		else {
			

			throw new IllegalStateException("User with Phone Number "+user.getPhoneNumber()+" does not exist exists.");
			
		}
		
		
	}
	
	
	public void deleteUser(long userId) {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findById(userId);
		
		if(user.isPresent()) {
			
			userRepository.deleteById(user.get().getUserId());
			
		}
		else {
			
			throw new IllegalStateException("User with Phone Number "+user.get().getUserId()+" does not exist exists.");
			
		}
		
		
	}

}
