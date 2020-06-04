package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author ZTL
 */
@Data
public class RepairerRegion {
    private String repairer_id;
    private String region_id;
    private String insert_by;
    private String update_by;
    private Date insert_time;
    private Date update_time;

    private Region region;
    private Repairer repairer;
}
