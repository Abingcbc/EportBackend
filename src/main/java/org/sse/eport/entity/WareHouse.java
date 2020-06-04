package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * @author ZTL
 */
@Data
public class WareHouse {
    private String id;
    private String name;
    private String region_id;
    private String location;
    private Integer area;
    private Double longitude;
    private Double latitude;
    private String insert_by;
    private String update_by;
    private Date insert_time;
    private Date update_time;

    private Set<AccessoryStored> accessory_stored;
    private Set<EqStored> eq_stored;
    private Region region;
}
