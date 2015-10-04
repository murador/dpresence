package org.gws.socialring.app.web.rest;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.gws.socialring.app.web.model.Contact;
import org.gws.socialring.app.web.model.Contact.STATUS;
import org.gws.socialring.app.web.model.User;
import org.gws.socialring.app.web.service.TwitterService;
import org.gws.socialring.app.web.service.anno.TwitterCon;
import org.gws.socialring.app.web.service.ex.ConnectionServiceException;

/**
 * Classe di implementazione per la connessione 
 * a twitter  
 */
@Path("/twitter")
@Stateless
@TwitterCon
public class TwitterAPIConnectionImpl implements TwitterService {
	
	
	@Inject
	private Logger log;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response login(User user) throws ConnectionServiceException {
		// TODO: fare l'implementazione 
		return null; 
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contact> getContacts(User user)
			throws ConnectionServiceException {
		return null;
	}

	
	/**
	 * Nota , lo stato è dato come un parametro 
	 * in ingresso e quindi non fa parte del body della richiesta http
	 * Da qui {@link QueryParam#annotationType()}
	 */
    @GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contact> getContacts(User user, @QueryParam("status") STATUS status)
			throws ConnectionServiceException {
		return null;
	}

}
