package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author ZTL
 */
@Data
public class EqTypeAccessory {
    private Integer eq_type_id;
    private String accessory_id;
    private String insert_by;
    private String update_by;
    private Date insert_time;
    private Date update_time;

    private Accessory accessory;
    private EqType eq_type;
}
