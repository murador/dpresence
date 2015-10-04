package org.gws.socialring.app.web.service;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Singleton;
import javax.inject.Inject;
import javax.inject.Named;

import org.gws.socialring.app.web.service.anno.FacebookCon;
import org.gws.socialring.app.web.service.anno.GooglePlusCon;
import org.gws.socialring.app.web.service.anno.InstagramCon;
import org.gws.socialring.app.web.service.anno.TwitterCon;

/**
 * @author Gianfranco
 * Definizione della factory di connessioni generato 
 * usando lo standard j2ee 7
 * #note : con l'annotazione #ConcurrencyManagement riusciamo ad evitare
 * il bottleneck dell'ejb singleton.
 * 
 */
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
@Named
public class SocialConnectionFactory {
	
	
	/**
	 * In questo caso recuperiamo la corretta implementazione 
	 * tramite i qualificatori inseriti in org.gws.socialring.app.web.service.anno
	 * 
	 */
	@Inject @TwitterCon
	private ConnectionService twitter; 
	
	@Inject @FacebookCon
	private ConnectionService facebook;
	@Inject @GooglePlusCon
	private ConnectionService googleplus;
	@Inject @InstagramCon
	private ConnectionService instagram; 
	
	public ConnectionService getTwitter() {
		return twitter;
	}
	public ConnectionService getFacebook() {
		return facebook;
	}
	public ConnectionService getGoogleplus() {
		return googleplus;
	}
	public ConnectionService getInstagram() {
		return instagram;
	}
}
