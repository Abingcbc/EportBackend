package org.sse.eport.entity;

import lombok.Data;

import java.util.Set;

/**
 * @author ZTL
 */
@Data
public class Region {
    private Integer id;
    private String province;
    private String city;
    private String county;

    private Set<EqInUse> eq_in_use;
    private Set<PatrolRegion> patrol_region;
    private Set<RepairerRegion> repairer_region;
    private Set<WareHouse> warehouse;
}
