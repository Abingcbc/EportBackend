package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author ZTL
 */
@Data
public class WorkOrder {
    private Integer id;
    private String status;
    private String repairer_id;
    private String dispatcher_id;
    private String work_picture;
    private String eq_id;
    private String insert_by;
    private String update_by;
    private Date insert_time;
    private Date update_time;

    private Dispatcher dispatcher;
    private EqInUse eq_in_use;
    private Repairer repairer;
}
