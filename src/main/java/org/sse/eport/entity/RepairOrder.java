package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author ZTL
 */
@Data
public class RepairOrder {
    private Integer id;
    private String report_picture;
    private String repair_type;
    private String description;
    private String status;
    private String tel_number;
    private String eq_id;
    private String dispatcher_id;
    private String insert_by;
    private String update_by;
    private Date insert_time;
    private Date update_time;

    private Dispatcher dispatcher;
    private EqInUse eq_in_use;
}
