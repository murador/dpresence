package org.gws.socialring.app.web.model;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private String name; 
	
	private List<Contact> contacts = new ArrayList<Contact>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	} 
	

}
