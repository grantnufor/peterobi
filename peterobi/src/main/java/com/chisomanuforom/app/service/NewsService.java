package com.chisomanuforom.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chisomanuforom.app.entity.News;
import com.chisomanuforom.app.repository.NewsRepository;



@Service
public class NewsService {

	

	private final NewsRepository newsRepository;

	public NewsService(NewsRepository newsRepository) {
		super();
		this.newsRepository = newsRepository;
	}
	
	public List<News> getNews(){
		
		return newsRepository.findAll();
	}
	

	public Optional<News> getNewsById(long newsId){
		
		return newsRepository.findById(newsId);
		
	}
	
	

	public void addNews(News newsObj) {
		
		Optional<News> newsById = newsRepository.findById(newsObj.getNewsId());
		
		if(!newsById.isPresent()) {
			
			newsRepository.save(newsObj);
			
		}
		else {
			
			throw new IllegalStateException("News already exists.");
			
		}
		
		
	}
	
	
	public void updateNews(News newsObj) {
		
		Optional<News> newsById = newsRepository.findById(newsObj.getNewsId());
		if(newsById.isPresent()) {
			
		    newsRepository.save(newsObj);
			
		}
		else {
			

			throw new IllegalStateException("News does not exist exists.");
			
		}
		
		
	}
	
	
	public void deleteNews(long newsId) {
		
		Optional<News> newsObj = newsRepository.findById(newsId);
		if(newsObj.isPresent()) {
			
		    newsRepository.deleteById(newsObj.get().getNewsId());
			
		}
		else {
			

			throw new IllegalStateException("News does not exist exists.");
			
		}
		
		
	}
	
}
