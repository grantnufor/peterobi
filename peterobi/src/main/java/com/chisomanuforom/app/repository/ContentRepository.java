package com.chisomanuforom.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chisomanuforom.app.entity.Content;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long> {
	
	Optional<Content> findByTitle(String title);

}
