package com.chisomanuforom.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTENT")
public class Content {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long contentId;
	private String title;
	private String url;
	private String datePublished;
	
	
	
	
	public Content(long contentId, String title, String url, String datePublished) {
		super();
		this.contentId = contentId;
		this.title = title;
		this.url = url;
		this.datePublished = datePublished;
	}
	
	

	@Override
	public String toString() {
		return "Content [contentId=" + contentId + ", title=" + title + ", url=" + url + ", datePublished="
				+ datePublished + "]";
	}



	public long getContentId() {
		return contentId;
	}




	public void setContentId(long contentId) {
		this.contentId = contentId;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getUrl() {
		return url;
	}




	public void setUrl(String url) {
		this.url = url;
	}




	public String getDatePublished() {
		return datePublished;
	}




	public void setDatePublished(String datePublished) {
		this.datePublished = datePublished;
	}
	
	



	
	
	

}
