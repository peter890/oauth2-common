/**
 *
 */
package org.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDataResponse {
    private String userId;
    private String email;

    @Override
    public String toString() {
        return "UserDataResponse [userId=" + this.userId + ", email=" + this.email + "]";
    }
}
