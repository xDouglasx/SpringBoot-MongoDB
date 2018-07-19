package br.com.douglas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserRole {
    
	@Id
	private String id;
	
	@DBRef
	private Role role;
	
	@DBRef
	private User user;
	
	public UserRole(User user, Role role) {
		this.user = user;
		this.role = role;
		
	}
	
	public UserRole() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
