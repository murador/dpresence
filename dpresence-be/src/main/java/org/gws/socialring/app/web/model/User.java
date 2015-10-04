package org.gws.socialring.app.web.model;

import java.util.HashSet;
import java.util.Set;

public class User {
	
	
	private String username; 
	private String password; 
	private String name; 
	private String surname; 
	
	// un utente ha diversi contatti 
	// associati a diverse categorie 
	// tra le quali la categoria di default 
	// root
	private Set<Category> categories = new HashSet<Category>();	
	public Set<Category> getCategories() {
		return categories;
	}
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	/**
	 * One User has 0..N social Profile 
	 * 
	 */
	private Set<Profile> profiles = new HashSet<Profile>(); 
	
	
	public Set<Profile> getProfiles() {
		return profiles;
	}
	public void setProfiles(Set<Profile> profiles) {
		this.profiles = profiles;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
