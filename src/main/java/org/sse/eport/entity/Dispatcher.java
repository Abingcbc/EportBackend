package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ZTL
 */
@Data
public class Dispatcher {
    private Integer id;
    private String dispatch_start;
    private String dispatch_stop;
    private String insert_by;
    private String update_by;
    private Date insert_time;
    private Date update_time;

    private Set<RepairOrder> repair_order;
    private Set<WorkOrder> work_order;
    private Staff staff;
}
