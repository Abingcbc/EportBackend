package org.sse.eport.dto;

import lombok.Data;

import java.util.List;

/**
 * @author cbc
 */
@Data
public class RepairSheetReceiver {
    String RSTid;
    String STFid;
    String DSTid;
    List<RepairRequiredStuff> ls;
}
