package com.chisomanuforom.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chisomanuforom.app.entity.Content;
import com.chisomanuforom.app.repository.ContentRepository;



@Service
public class ContentService {
	
	private final ContentRepository contentRepository;

	public ContentService(ContentRepository contentRepository) {
		super();
		this.contentRepository = contentRepository;
	}
	
	public List<Content> getContents(){
		
		return contentRepository.findAll();
	}
	

	public Optional<Content> getContentById(long contentId){
		
		return contentRepository.findById(contentId);
		
	}
	
	
	
	public Optional<Content> getContentByTitle(String title) {
		
		return contentRepository.findByTitle(title);
		
	}
	

	public void addContent(Content content) {
		
		Optional<Content> contentByTitle = contentRepository.findByTitle(content.getTitle());
		
		if(!contentByTitle.isPresent()) {
			
			contentRepository.save(content);
			
		}
		else {
			
			throw new IllegalStateException("Content with Title "+content.getTitle()+" already exists.");
			
		}
		
		
	}
	
	
	public void updateContent(Content content) {
		// TODO Auto-generated method stub
		Optional<Content> contentById = contentRepository.findById(content.getContentId());
		if(contentById.isPresent()) {
			
			contentRepository.save(content);
			
		}
		else {
			

			throw new IllegalStateException("Content with Content Id "+content.getContentId()+" does not exist exists.");
			
		}
		
		
	}
	
	
	public void deleteContent(long contentId) {
		// TODO Auto-generated method stub
		Optional<Content> content = contentRepository.findById(contentId);
		
		if(content.isPresent()) {
			
			contentRepository.deleteById(contentId);
			
		}
		else {
			
			throw new IllegalStateException("Content with Content Id "+content.get().getContentId()+" does not exist exists.");
			
		}
		
		
	}

}
