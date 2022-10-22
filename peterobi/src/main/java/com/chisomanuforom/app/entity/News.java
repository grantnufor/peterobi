package com.chisomanuforom.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "NEWS")
public class News {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long newsId;
	private String newsHeading;
	private String newsContent;
	private String externalUrl;
	private String dateAdded;
	private long uploadedBy;
	
	
	
	
	
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}







	public News(long newsId, String newsHeading, String newsContent, String externalUrl, String dateAdded,
			long uploadedBy) {
		super();
		this.newsId = newsId;
		this.newsHeading = newsHeading;
		this.newsContent = newsContent;
		this.externalUrl = externalUrl;
		this.dateAdded = dateAdded;
		this.uploadedBy = uploadedBy;
	}


	
	
	
	
	
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", newsHeading=" + newsHeading + ", newsContent=" + newsContent
				+ ", externalUrl=" + externalUrl + ", dateAdded=" + dateAdded + ", uploadedBy=" + uploadedBy + "]";
	}






	public long getNewsId() {
		return newsId;
	}



	public void setNewsId(long newsId) {
		this.newsId = newsId;
	}



	public String getNewsHeading() {
		return newsHeading;
	}



	public void setNewsHeading(String newsHeading) {
		this.newsHeading = newsHeading;
	}



	public String getNewsContent() {
		return newsContent;
	}



	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}



	public String getExternalUrl() {
		return externalUrl;
	}



	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}



	public String getDateAdded() {
		return dateAdded;
	}



	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}



	public long getUploadedBy() {
		return uploadedBy;
	}



	public void setUploadedBy(long uploadedBy) {
		this.uploadedBy = uploadedBy;
	}



	
	
	
	
	
}
