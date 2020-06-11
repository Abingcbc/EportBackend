package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author ZTL
 */
@Data
public class PatrolLog {
    private Integer id;
    private Integer patrol_id;
    private Integer eq_id;
    private String patrol_time;
    private String patrol_result;
    private String patrol_picture;
    private Integer insert_by;
    private Integer update_by;
    private Date insert_time;
    private Date update_time;

    private EqInUse eq_in_use;
    private Patrol patrol;
}
