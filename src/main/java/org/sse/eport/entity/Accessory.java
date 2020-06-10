package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * @author ZTL
 */
@Data
public class Accessory {
    private Integer id;
    private String type_name;
    private String model_number;
    private Double price;
    private String factory_id;
    private String insert_by;
    private String update_by;
    private Date insert_time;
    private Date update_time;

    private Factory factory;
    private Set<AccessoryStored> accessory_stored;
    private Set<EqTypeAccessory> eq_type_accessory;
}
