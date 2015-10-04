package org.gws.socialring.app.web.service;

import java.util.List;

import javax.ws.rs.core.Response;

import org.gws.socialring.app.web.model.Contact;
import org.gws.socialring.app.web.model.User;
import org.gws.socialring.app.web.service.ex.ConnectionServiceException;

/**
 * Interfaccia di alto livello per le connessioni a tutti i socialnetwork EDIT:
 * questo è quello di cui si parlava nella discussione del 28/3/2015 per la
 * decisione di una facade.
 * 
 * @author Gianfranco
 *
 */
public interface ConnectionService {
	
	

	/**
	 * Esegue un login in base al social network 
	 * al quale ci si vuole connettere
	 * @param user
	 * @throws ConnectionServiceException
	 */
	public Response login(User user) throws ConnectionServiceException; 
	

	/**
	 * Recupera una lista di contatti in base all'account 
	 * al quale si sta
	 * connettendo
	 * @param user
	 *            Account utente di tipo {@link User}
	 * @return Ritorna una lista di al massimo 20 elementi di tipo
	 *         {@link Contact}
	 * @throws ConnectionServiceException
	 */
	List<Contact> getContacts(User user) throws ConnectionServiceException;

	/**
	 * Ritorna una lista di contatti in base all'account utente ed allo stato
	 * dei contatti che si vuole recuperare
	 * 
	 * @param user
	 *            Account utente
	 * @param status
	 *            stato dei contatti richiesto
	 * @return Lista di oggetti di tipo {@link Contact}
	 * @throws ConnectionServiceException
	 */
	List<Contact> getContacts(User user, Contact.STATUS status)
			throws ConnectionServiceException;

}
