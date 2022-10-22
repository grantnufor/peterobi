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

import com.chisomanuforom.app.entity.News;
import com.chisomanuforom.app.service.NewsService;


@RestController
@RequestMapping("/News")

public class NewsController {
	
	
	private final NewsService newsService;

	@Autowired
	public NewsController(NewsService newsService) {
		super();
		this.newsService = newsService;
	}
	
	
	@GetMapping
	public List<News> getNews(){
		
		return newsService.getNews();
		
	}
	
	

	
	@GetMapping("/{newsId}")
	public Optional<News> getNewsByNewsId(@PathVariable long newsId)
	{
		return newsService.getNewsById(newsId);	
		
	}
	
	
	
	
	@PostMapping
	public void createNews(@RequestBody News news) {
		
		newsService.addNews(news);
		
	}
	
	
	
	@PostMapping("/{newsId}")
	public String deleteNews(@PathVariable long newsId) {
		
		newsService.deleteNews(newsId);
		
		return "News has been deleted with id = "+newsId;
		
	}
	

}
