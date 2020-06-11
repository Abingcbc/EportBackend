package org.sse.eport.dto;

import lombok.Data;

import java.util.Map;

/**
 * @author cbc
 */
@Data
public class MobileRepairOrderDto {
    String id;
    String device_id;
    String device_type;
    String device_model;
    String address;
    Map<String, Double> position;
    String url;
    String detail;
    String phone;
}
