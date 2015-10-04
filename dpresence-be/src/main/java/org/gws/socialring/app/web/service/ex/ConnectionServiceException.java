package org.gws.socialring.app.web.service.ex;

public class ConnectionServiceException extends Exception{

	
	private static final long serialVersionUID = 3028669076049006134L;

	public ConnectionServiceException() {
		super();
	}

	public ConnectionServiceException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ConnectionServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConnectionServiceException(String message) {
		super(message);
	}

	public ConnectionServiceException(Throwable cause) {
		super(cause);
	}

}
