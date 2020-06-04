package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * @author ZTL
 */
@Data
public class Factory {
    private String id;
    private String name;
    private String principal;
    private String phone;
    private String address;
    private String insert_by;
    private String update_by;
    private Date insert_time;
    private Date update_time;

    private Set<Accessory> accessory;
    private Set<EqType> eq_type;
}
