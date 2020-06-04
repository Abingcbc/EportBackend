package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author ZTL
 */
@Data
public class PatrolLog {
    private String id;
    private String patrol_id;
    private String eq_id;
    private String patrol_time;
    private String patrol_result;
    private String patrol_picture;
    private String insert_by;
    private String update_by;
    private Date insert_time;
    private Date update_time;

    private EqInUse eq_in_use;
    private Patrol patrol;
}
