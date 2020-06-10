package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * @author ZTL
 */
@Data
public class EqInUse {
    private Integer id;
    private String production_time;
    private String install_time;
    private String owner;
    private String manager;
    private String status;
    private String address;
    private Double longitude;
    private Double latitude;
    private String qr_code;
    private String region_id;
    private String type_id;
    private String insert_by;
    private String update_by;
    private Date insert_time;
    private Date update_time;

    private Region region;
    private EqType eq_type;
    private Set<PatrolLog> patrol_log;
    private Set<RepairOrder> repair_order;
    private Set<WorkOrder> work_order;
}
