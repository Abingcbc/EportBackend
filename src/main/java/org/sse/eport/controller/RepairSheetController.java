package org.sse.eport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sse.eport.Basic.Result;
import org.sse.eport.dto.RepairRequiredStuff;
import org.sse.eport.dto.RepairSheetReceiver;
import org.sse.eport.mapper.RepairSheetMapper;
import org.sse.eport.mapper.generated.*;
import org.sse.eport.pojo.*;

import java.util.*;

/**
 * @author cbc
 */
@RestController
public class RepairSheetController {

    @Autowired
    StaffMapper staffMapper;
    @Autowired
    RepairOrderMapper repairOrderMapper;
    @Autowired
    EqInUseMapper eqInUseMapper;
    @Autowired
    EqTypeMapper eqTypeMapper;
    @Autowired
    EqStoredMapper eqStoredMapper;
    @Autowired
    RepairSheetMapper repairSheetMapper;
    @Autowired
    AccessoryStoredMapper accessoryStoredMapper;
    @Autowired
    AccessoryMapper accessoryMapper;
    @Autowired
    WorkOrderMapper workOrderMapper;

    public Result scheduleRepairSheet(RepairSheetReceiver receiver) {
        receiver.setSTFid(receiver.getSTFid().substring(0, 2));
        receiver.setRSTid(receiver.getRSTid().substring(0, 2));
        Staff dispatcher = staffMapper.selectByPrimaryKey(Integer.parseInt(receiver.getDSTid()));
        RepairOrder repairOrder = repairOrderMapper.selectByPrimaryKey(Integer.parseInt(receiver.getRSTid()));
        EqInUse eqInUse = eqInUseMapper.selectByPrimaryKey(repairOrder.getEqId());
        eqInUse.setStatus("0");
        Double[] oldEqLocation = new Double[2];
        oldEqLocation[0] = eqInUse.getLatitude();
        oldEqLocation[1] = eqInUse.getLongitude();
        for (RepairRequiredStuff requirement: receiver.getLs()) {
            if (requirement.getType().equals("器材")) {
                EqTypeExample example = new EqTypeExample();
                EqTypeExample.Criteria criteria = example.createCriteria();
                criteria.andTypeNameEqualTo(requirement.getType());
                criteria.andModelNumberEqualTo(requirement.getNumber());
                EqType eqType = eqTypeMapper.selectByExample(example).get(0);
                // 取离损坏器材最近的仓库的零件
                List<org.sse.eport.entity.EqStored> storedList = repairSheetMapper.selectEqStoredByTypeId(eqType.getId());
                Collections.sort(storedList, (Comparator<org.sse.eport.entity.EqStored>) (o1, o2) -> {
                    double distance1 = Math.pow(o1.getWarehouse().getLatitude()-oldEqLocation[0], 2) +
                            Math.pow(o1.getWarehouse().getLongitude()-oldEqLocation[1], 2);
                    double distance2 = Math.pow(o2.getWarehouse().getLatitude()-oldEqLocation[0], 2) +
                            Math.pow(o2.getWarehouse().getLongitude()-oldEqLocation[1], 2);
                    if (distance1 > distance2) {
                        return 1;
                    } else {
                        return 0;
                    }
                });
                eqStoredMapper.deleteByPrimaryKey(storedList.get(0).getId());
            } else {
                AccessoryExample example = new AccessoryExample();
                AccessoryExample.Criteria criteria = example.createCriteria();
                criteria.andTypeNameEqualTo(requirement.getType());
                criteria.andModelNumberEqualTo(requirement.getNumber());
                Accessory accessory = accessoryMapper.selectByExample(example).get(0);
                List<org.sse.eport.entity.AccessoryStored> storedList = repairSheetMapper.selectAcStoredByTypeId(accessory.getId());
                Collections.sort(storedList, (Comparator<org.sse.eport.entity.AccessoryStored>) (o1, o2) -> {
                    double distance1 = Math.pow(o1.getWarehouse().getLatitude()-oldEqLocation[0], 2) +
                            Math.pow(o1.getWarehouse().getLongitude()-oldEqLocation[1], 2);
                    double distance2 = Math.pow(o2.getWarehouse().getLatitude()-oldEqLocation[0], 2) +
                            Math.pow(o2.getWarehouse().getLongitude()-oldEqLocation[1], 2);
                    if (distance1 > distance2) {
                        return 1;
                    } else {
                        return 0;
                    }
                });
                List<AccessoryStored> deleteAcStoreList = new ArrayList<>();
                int unsolved = Integer.parseInt(requirement.getNumber());
                for (int i = 0; i != storedList.size(); i++) {
                    if (storedList.get(i).getQuantity() > unsolved) {
                        storedList.get(i).setQuantity(storedList.get(i).getQuantity()-unsolved);
                        unsolved = 0;
                        break;
                    } else if (storedList.get(i).getQuantity() == unsolved) {
                        AccessoryStoredKey key = new AccessoryStoredKey();
                        key.setAccessoryId(storedList.get(i).getAccessory_id());
                        key.setWarehouseId(Integer.parseInt(storedList.get(i).getWarehouse_id()));
                        accessoryStoredMapper.deleteByPrimaryKey(key);
                        unsolved = 0;
                        break;
                    } else {
                        AccessoryStoredKey key = new AccessoryStoredKey();
                        key.setAccessoryId(storedList.get(i).getAccessory_id());
                        key.setWarehouseId(Integer.parseInt(storedList.get(i).getWarehouse_id()));
                        accessoryStoredMapper.deleteByPrimaryKey(key);
                        unsolved -= storedList.get(i).getQuantity();
                    }
                }
                if (unsolved != 0) {
                    return Result.fail();
                }
            }
        }
        WorkOrder workOrder = new WorkOrder();
        workOrder.setDispatcherId(dispatcher.getIsSuper()=="1"?null:dispatcher.getId());
        workOrder.setEqId(repairOrder.getEqId());
        workOrder.setInsertTime(Calendar.getInstance().getTime());
        workOrder.setInsertBy(String.valueOf(dispatcher.getId()));
        workOrder.setRepairerId(Integer.valueOf(receiver.getSTFid()));
        workOrder.setWorkPicture("https://i.loli.net/2019/07/11/5d26f8e7d8de943824.jpg");
        workOrder.setStatus("0");
        workOrderMapper.insert(workOrder);
        repairOrder.setStatus("2");
        return Result.success();
    }
}
