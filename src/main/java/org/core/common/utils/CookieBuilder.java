/**
 * 
 */
package org.core.common.utils;

import javax.servlet.http.Cookie;

import org.core.common.enums.CookiesName;

/**
 * @author piotrek
 *
 */
public class CookieBuilder {
	private static CookieBuilder builder = new CookieBuilder();
	private static Cookie cookie = new Cookie("", "");

	public static CookieBuilder setNameAndValue(final String name, final String value) {
		cookie = new Cookie(name, value);
		return builder;
	}

	public static CookieBuilder setNameAndValue(final CookiesName name, final String value) {
		cookie = new Cookie(name.getValue(), value);
		return builder;
	}

	public static CookieBuilder setComment(final String purpose) {
		cookie.setComment(purpose);
		return builder;
	}

	public static CookieBuilder setMaxAge(int expiry) {
		cookie.setMaxAge(expiry);
		return builder;
	}

	public static CookieBuilder setDomain(String domain) {
		cookie.setDomain(domain);
		return builder;
	}

	public static CookieBuilder setPath(String uri) {
		cookie.setPath(uri);
		return builder;
	}

	public static CookieBuilder setSecure(boolean flag) {
		cookie.setSecure(flag);
		return builder;
	}

	public static CookieBuilder setHttpOnly(boolean isHttpOnly) {
		cookie.setHttpOnly(isHttpOnly);
		return builder;
	}

	public static Cookie build() {
		return cookie;
	}

}
