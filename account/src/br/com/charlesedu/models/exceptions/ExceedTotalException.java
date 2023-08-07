package br.com.charlesedu.models.exceptions;

public class ExceedTotalException extends Exception {
 
	private static final long serialVersionUID = 1L;

	public ExceedTotalException(String message) {
        super(message);
    }

    public ExceedTotalException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceedTotalException(Throwable cause) {
        super(cause);
    }

    public ExceedTotalException() {
    }

    public ExceedTotalException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
