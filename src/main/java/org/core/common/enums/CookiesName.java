package org.core.common.enums;

/**
 * @author piotrek
 *
 */
public enum CookiesName {
	SSID("SSID"),
	OAuthUserId("OAUTHUSERID"),
	AccessToken("ACCESSTOKEN"),
	AppId("APPID"),
	SSOCookie("SSOCOOKIE");
	
	private String value;
	
	CookiesName(final String value) {
		this.value = value;
	}
	/**
	 * @return Zwraca value
	 */
	public String getValue() {
		return value;
	}

}
