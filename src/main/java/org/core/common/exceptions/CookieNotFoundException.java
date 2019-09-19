/**
 * 
 */
package org.core.common.exceptions;

public class CookieNotFoundException extends Exception {
	public CookieNotFoundException(final String cookieName) {
		super("Cookie name: " + cookieName);
	}

}
