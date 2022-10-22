package com.chisomanuforom.app.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "[USER]")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	private String firstName;
	private String surname;
	private String sex;
	private String emailAddress;
	private String phoneNumber;
	private String password;
	private String dateCreated;
	private String dateLastUpdated;
	private String status;
	private String profilePicture;
	private long siteVisitCount;
	private String verified;
	
	
	

	public User(long userId, String firstName, String surname, String sex, String emailAddress, String phoneNumber,
			String password, String dateCreated, String dateLastUpdated, String status, String profilePicture,
			long siteVisitCount, String verified) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.surname = surname;
		this.sex = sex;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.dateCreated = dateCreated;
		this.dateLastUpdated = dateLastUpdated;
		this.status = status;
		this.profilePicture = profilePicture;
		this.siteVisitCount = siteVisitCount;
		this.verified = verified;
	}
	
	
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", surname=" + surname + ", sex=" + sex
				+ ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + ", password=" + password
				+ ", dateCreated=" + dateCreated + ", dateLastUpdated=" + dateLastUpdated + ", status="
				+ status + ", profilePicture=" + profilePicture + ", siteVisitCount=" + siteVisitCount + ", verified="
				+ verified + "]";
	}




	public User() {
		super();
		// TODO Auto-generated constructor stub
	}




	
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getDateLastUpdated() {
		return dateLastUpdated;
	}
	public void setDateLastUpdated(String dateLastRegistered) {
		this.dateLastUpdated = dateLastRegistered;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	public long getSiteVisitCount() {
		return siteVisitCount;
	}
	public void setSiteVisitCount(long siteVisitCount) {
		this.siteVisitCount = siteVisitCount;
	}
	public String getVerified() {
		return verified;
	}
	public void setVerified(String verified) {
		this.verified = verified;
	}
	
	
	

}
