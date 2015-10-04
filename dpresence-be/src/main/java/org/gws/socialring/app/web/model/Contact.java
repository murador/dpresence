package org.gws.socialring.app.web.model;

import java.util.ArrayList;
import java.util.List;


public class Contact {
	
	public enum STATUS {
		CONNECTED, ALL
	}
	
	private String nickname; 
	private String name; 
	private String surname; 
	private String decription;
	private List<PublishedItem> items = new ArrayList<PublishedItem>();
	private List<SocialSubscription> subscriptions = new ArrayList<SocialSubscription>();
	
	public List<SocialSubscription> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(List<SocialSubscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	public List<PublishedItem> getItems() {
		return items;
	}
	public void setItems(List<PublishedItem> items) {
		this.items = items;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	} 
	
	

}
