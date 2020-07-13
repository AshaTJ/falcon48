package com.fis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@SequenceGenerator(name="seq", initialValue=100, allocationSize=1000)
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq") 
	private long id;
	
	private String firstName;
	private String lastName;
	private String username;
	@JsonIgnore
	private String password;
	@JsonIgnore
	private String confirmPassword;
	
	
	
	public long getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
