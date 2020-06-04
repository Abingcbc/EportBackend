package org.sse.eport.dto;

import lombok.Data;

/**
 * @author ZTL
 */
@Data
public class MobileRepairOrderPutReciever {
    public String deviceID;
    public String imgURL;
    public String detail;
    public String phone;
    public String problem_type;
    public Integer status;
    public String id;
}
