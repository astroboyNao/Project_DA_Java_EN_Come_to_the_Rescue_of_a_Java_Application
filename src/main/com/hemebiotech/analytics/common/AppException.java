package com.hemebiotech.analytics.common;

/**
 * The Class AppException.
 */
@SuppressWarnings("serial")
public class AppException extends RuntimeException {

	/**
	 * Instantiates a new app exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public AppException(String message, Throwable cause) {
        super(message, cause);
    }

}
