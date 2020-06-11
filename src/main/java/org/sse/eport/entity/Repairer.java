package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * @author ZTL
 */
@Data
public class Repairer {
    private Integer id;
    private String insert_by;
    private String update_by;
    private Date insert_time;
    private Date update_time;

    private Set<RepairerRegion> repairer_regions;
    private Set<WorkOrder> work_order;
    private Staff staff;
}
