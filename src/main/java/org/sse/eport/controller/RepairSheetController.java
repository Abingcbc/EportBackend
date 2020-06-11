package org.sse.eport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sse.eport.Basic.Result;
import org.sse.eport.dto.RepairRequiredStuff;
import org.sse.eport.dto.RepairSheetReceiver;
import org.sse.eport.mapper.generated.RepairOrderMapper;
import org.sse.eport.mapper.generated.StaffMapper;
import org.sse.eport.pojo.RepairOrder;
import org.sse.eport.pojo.Staff;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author cbc
 */
@RestController
public class RepairSheetController {

    @Autowired
    StaffMapper staffMapper;

    @Autowired
    RepairOrderMapper repairOrderMapper;

//    public Result scheduleRepairSheet(RepairSheetReceiver receiver) {
//        receiver.setSTFid(receiver.getSTFid().substring(0, 2));
//        receiver.setRSTid(receiver.getRSTid().substring(0, 2));
//        Staff dispatcher = staffMapper.selectByPrimaryKey(Integer.parseInt(receiver.getDSTid()));
//        RepairOrder repairOrder = repairOrderMapper.selectByPrimaryKey(Integer.parseInt(receiver.getRSTid()));
//        EqInUse eqInUse = repairSheetMapper.getEqInUseById(repairOrder.getEqId());
//        eqInUse.setStatus("0");
//        Double[] oldEqLocation = new Double[2];
//        oldEqLocation[0] = eqInUse.getLatitude();
//        oldEqLocation[1] = eqInUse.getLongitude();
//        for (RepairRequiredStuff requirement: receiver.getLs()) {
//            if (requirement.getType().equals("器材")) {
//                EqType eqType = repairSheetMapper.getEqTypeByNameAndNumber(requirement.getType(),
//                        requirement.getNumber());
//                // 取离损坏器材最近的仓库的零件
//                List<EqStored> storedList = repairSheetMapper.getEqStoredByEqId(eqType.getId());
//                Collections.sort(storedList, new Comparator<EqStored>() {
//                    @Override
//                    public int compare(EqStored o1, EqStored o2) {
//                        double distance1 = Math.pow(o1.getWarehouse().getLatitude()-oldEqLocation[0], 2) +
//                                Math.pow(o1.getWarehouse().getLongitude()-oldEqLocation[1], 2);
//                        double distance2 = Math.pow(o2.getWarehouse().getLatitude()-oldEqLocation[0], 2) +
//                                Math.pow(o2.getWarehouse().getLongitude()-oldEqLocation[1], 2);
//                        if (distance1 > distance2) {
//                            return 1;
//                        } else {
//                            return 0;
//                        }
//                    }
//                });
//                repairSheetMapper.removeEqStoredById(storedList.get(0).getId());
//            } else {
//
//            }
//        }
//    }
}
