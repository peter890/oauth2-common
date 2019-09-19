/**
 *
 */
package org.api.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserSessionDataResponse {
    private String userId;
    private int tokenLifeTime;
}
