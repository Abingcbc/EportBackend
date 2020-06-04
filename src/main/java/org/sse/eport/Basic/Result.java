package org.sse.eport.Basic;

import lombok.Data;

/**
 * @author ZTL
 */
@Data
public class Result {
    private String code;
    private String message;
    private Object data;
}
