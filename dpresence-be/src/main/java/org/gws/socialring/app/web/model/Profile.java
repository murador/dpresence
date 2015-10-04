package org.gws.socialring.app.web.model;

public class Profile {
	
	/**
	 * Ogni profilo ha almeno un social account
	 */
	private SocialAlias socialAccount;

	public SocialAlias getSocialAccount() {
		return socialAccount;
	}

	public void setSocialAccount(SocialAlias socialAccount) {
		this.socialAccount = socialAccount;
	}

	
	/**
	 * Per creare una profilo devo necessariamente 
	 * indicare un social alias
	 * @param socialAccount
	 */
	public Profile(SocialAlias socialAccount) {
		super();
		this.socialAccount = socialAccount;
	} 
	

}
