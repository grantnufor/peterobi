package com.chisomanuforom.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chisomanuforom.app.entity.News;;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
	

//	Optional<User> findUserByPhoneNumber(String phoneNumber);
//	
//	Optional<User> findUserByPhoneNumberAndPassword(String phoneNumber, String password);
//	
//	Optional<User> findUserByEmailAddressAndPassword(String emailAddress, String password);
	
}