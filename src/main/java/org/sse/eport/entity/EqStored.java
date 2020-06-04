package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author ZTL
 */
@Data
public class EqStored {
    private String id;
    private String product_time;
    private String status;
    private String eq_type_id;
    private String warehouse_id;
    private String insert_by;
    private String update_by;
    private Date insert_time;
    private Date update_time;

    private EqType eq_type;
    private WareHouse warehouse;
}
