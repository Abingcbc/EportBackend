package org.sse.eport.entity;

import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * @author ZTL
 */
@Data
public class Staff {
    private String id;
    private String name;
    private String account_id;
    private String password;
    private String tel_number;
    private String id_card_number;
    private String is_super;
    private String insert_by;
    private String update_by;
    private Date update_time;
    private Date insert_time;

    private Dispatcher dispatcher;
    private Patrol patrol;
    private Repairer repairer;
    private Set<Staff> staff1;
    private Staff staff2;
    private Set<Staff> staff11;
    private Staff staff3;
}
