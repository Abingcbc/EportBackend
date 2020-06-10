package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * @author ZTL
 */
@Data
public class Patrol {
    private Integer id;
    private String patrol_start;
    private String patrol_stop;
    private String insert_by;
    private String update_by;
    private Date update_time;
    private Date insert_time;

    private Set<PatrolLog> patrol_log;
    private Set<PatrolRegion> patrol_region;
    private Staff staff;
}
