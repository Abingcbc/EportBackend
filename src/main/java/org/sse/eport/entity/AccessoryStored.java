package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author ZTL
 */
@Data
public class AccessoryStored {
    private String accessory_id;
    private String warehouse_id;
    private Integer quantity;
    private String insert_by;
    private String update_by;
    private Date insert_time;
    private Date update_time;

    private Accessory accessory;
    private WareHouse warehouse;
}
