package org.gws.socialring.app.web.model;

/**
 * Questa classe embedded rappresenta 
 * tutti i possibili alias che un utente può avere 
 * all'interno dei social, mantiene , inoltre delle informazioni
 * particolari di accounto
 * @author Gianfranco
 *
 */
public class SocialAlias {
	
	// Questa è la provenienza del social network
	private enum SOCIAL {
		  TWITTER, GOOGLE_PLUS, LINKEDIN,
		  FACEBOOK
	}; 	
	private String aliasName;
	private String username; 
	private String password;
	private SOCIAL social; 
	
	
	
	public SOCIAL getSocial() {
		return social;
	}
	public void setSocial(SOCIAL social) {
		this.social = social;
	}
	public String getAliasName() {
		return aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
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
