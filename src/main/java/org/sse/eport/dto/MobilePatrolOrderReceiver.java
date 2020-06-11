package org.sse.eport.dto;

import lombok.Data;

/**
 * @author cbc
 */
@Data
public class MobilePatrolOrderReceiver {
    private int deviceID;
    private int id;
    private String imageUrl;
    private int status;
    private String time;
}
