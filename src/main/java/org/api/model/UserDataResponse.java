/**
 * 
 */
package org.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



/**
 * @author piotrek
 *
 */
//@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDataResponse {
	private String userId;
	private String email;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDataResponse [userId=" + userId + ", email=" + email + "]";
	}
}
