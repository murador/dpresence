package org.gws.socialring.app.web.model;

import java.util.ArrayList;
import java.util.List;

public class SocialSubscription {
	
	
	// Qui si eleca la sottoscritione 
	// del contatto
	private List<SocialAlias> socialSub = new ArrayList<SocialAlias>();
	public List<SocialAlias> getSocialSub() {
		return socialSub;
	}
	public void setSocialSub(List<SocialAlias> socialSub) {
		this.socialSub = socialSub;
	}
	private String description;

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	} 
	
}
