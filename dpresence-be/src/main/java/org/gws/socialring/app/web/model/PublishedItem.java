package org.gws.socialring.app.web.model;

public class PublishedItem {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getItemBody() {
		return itemBody;
	}

	public void setItemBody(String itemBody) {
		this.itemBody = itemBody;
	}

	private String name; 
	private String description; 
	
	// Questo rappresenta una sorgente 
	// unica del documento che è stato pubblicato 
	// in formato json
	private String itemBody; 
	
	
	
}
