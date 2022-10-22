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

import com.chisomanuforom.app.entity.Content;
import com.chisomanuforom.app.service.ContentService;

@RestController
@RequestMapping("/Content")
public class ContentController {
	
	private final ContentService contentService;

	@Autowired
	public ContentController(ContentService contentService) {
		super();
		this.contentService = contentService;
	}
	
	
	@GetMapping
	public List<Content> getContents(){
		
		return contentService.getContents();
		
	}
	

	
	@GetMapping("/{contentId}")
	public Optional<Content> getContentByContentId(@PathVariable long contentId)
	{
		return contentService.getContentById(contentId);	
		
	}

	
	
	@GetMapping("/{title}")
	public Optional<Content> getContentByTitle(@PathVariable String title)
	{
		return contentService.getContentByTitle(title);	
		
	}
	
	
	@PostMapping
	public void registerContent(@RequestBody Content content) {
		
		contentService.addContent(content);
		
	}
	
	
	
	@PostMapping("/{contentId}")
	public String deleteContent(@PathVariable long contentId) {
		
		contentService.deleteContent(contentId);
		
		return "Content has been deleted with id ="+contentId;
		
	}

}
