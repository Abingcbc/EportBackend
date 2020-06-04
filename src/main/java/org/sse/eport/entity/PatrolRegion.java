package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author asus
 */
@Data
public class PatrolRegion {
    private String patrol_id;
    private String region_id;
    private String insert_by;
    private String update_by;
    private Date insert_time;
    private Date update_time;

    private Patrol patrol;
    private Region region;
}
