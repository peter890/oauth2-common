/**
 *
 */
package org.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponse<T> {
    private int resultCode;
    private String resultMessage;
    private T content;
}
