package org.sse.eport.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.sse.eport.Basic.Result;
import org.sse.eport.dto.MobilePatrolOrderReceiver;
import org.sse.eport.dto.MobileRepairOrderDto;
import org.sse.eport.dto.MobileRepairOrderPutReciever;
import org.sse.eport.dto.MobileWorkOrderReciever;
import org.sse.eport.entity.EqInUse;
import org.sse.eport.entity.PatrolLog;
import org.sse.eport.entity.RepairOrder;
import org.sse.eport.entity.WorkOrder;
import org.sse.eport.mapper.MobileMapper;
import org.sse.eport.mapper.generated.EqInUseMapper;
import org.sse.eport.mapper.generated.EqTypeMapper;
import org.sse.eport.mapper.generated.PatrolRegionMapper;
import org.sse.eport.pojo.EqType;
import org.sse.eport.pojo.PatrolExample;
import org.sse.eport.pojo.PatrolRegion;
import org.sse.eport.pojo.PatrolRegionExample;

import java.util.*;

/**
 * @author ZTL
 */
@Service
@Slf4j
public class MobileService {
    @Autowired
    private MobileMapper mobileMapper;
    @Autowired
    PatrolRegionMapper patrolRegionMapper;
    @Autowired
    EqInUseMapper eqInUseMapper;
    @Autowired
    EqTypeMapper eqTypeMapper;

    public Result postRepairOrder(MobileRepairOrderPutReciever mobileRepairOrderReciever) {
        //添加报修单
        EqInUse eq = mobileMapper.findEqInUseById(Integer.valueOf(mobileRepairOrderReciever.deviceID));
        if ("1".equals(eq.getStatus())) {
            return Result.fail();
        }
        RepairOrder repair_order = new RepairOrder();
        //这里测试的时候要注意
        repair_order.setReport_picture(mobileRepairOrderReciever.imgURL);
        repair_order.setRepair_type(mobileRepairOrderReciever.problem_type);
        repair_order.setDescription(mobileRepairOrderReciever.detail);
        repair_order.setStatus(mobileRepairOrderReciever.status.toString());
        repair_order.setTel_number(mobileRepairOrderReciever.phone);
        repair_order.setEq_id(mobileRepairOrderReciever.deviceID);
        repair_order.setDispatcher_id("");
        repair_order.setInsert_by(mobileRepairOrderReciever.id);
        repair_order.setInsert_by(mobileRepairOrderReciever.id);
        Date now = new Date();
        repair_order.setInsert_time(now);
        repair_order.setUpdate_time(now);
        try {
            mobileMapper.addRepairOrder(repair_order);
            mobileMapper.updateStatusOfEqInUse(eq.getId(), "1");
            log.info("添加了报修单");
            return Result.success();
        } catch (Exception e) {
            return Result.fail();
        }
    }

    public Result putRepairOrder(MobileRepairOrderPutReciever reciever) {
        //修改报修单
        RepairOrder repair_order = mobileMapper.findRepairOrderById(Integer.valueOf(reciever.id));
        if (repair_order == null) {
            return Result.fail();
        } else {
            repair_order.setEq_id(reciever.deviceID);
            repair_order.setReport_picture(reciever.imgURL);
            repair_order.setDescription(reciever.detail);
            repair_order.setTel_number(reciever.phone);
            repair_order.setRepair_type(reciever.problem_type);
            repair_order.setStatus(reciever.status.toString());
            mobileMapper.updateRepairOrder(repair_order);
            log.info("更改了报修单");
            return Result.success();
        }
    }

    public Result postWorkOrder(MobileWorkOrderReciever mobileWorkOrderReciever) {
        WorkOrder work_order = mobileMapper.findWorkOrderById(Integer.valueOf(mobileWorkOrderReciever.id));
        if (work_order == null) {
            return Result.fail();
        } else {
            try {
                mobileMapper.updateWorkOrderPicAndStatus(work_order.getId(), mobileWorkOrderReciever.imgURL, mobileWorkOrderReciever.status.toString());
                return Result.success();
            } catch (Exception e) {
                return Result.fail();
            }
        }
    }

    public Result postPatrolOrder(MobilePatrolOrderReceiver receiver) {
        PatrolLog patrolLog = new PatrolLog();
        patrolLog.setPatrol_id(receiver.getId());
        patrolLog.setEq_id(receiver.getDeviceID());
        patrolLog.setPatrol_time(receiver.getTime());
        patrolLog.setPatrol_result(String.valueOf(receiver.getStatus()));
        patrolLog.setPatrol_picture(receiver.getImageUrl());
        patrolLog.setInsert_by(receiver.getId());
        patrolLog.setUpdate_by(receiver.getId());
        if (mobileMapper.addPatrolOrder(patrolLog)) {
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    public Result getRepair(String id) {
        PatrolRegionExample patrolRegionExample = new PatrolRegionExample();
        PatrolRegionExample.Criteria criteria = patrolRegionExample.createCriteria();
        criteria.andPatrolIdEqualTo(Integer.parseInt(id));
        List<PatrolRegion> regionList = patrolRegionMapper.selectByExample(patrolRegionExample);
        if (regionList.size() == 0) {
            return Result.success();
        }
        List<Integer> regions = new ArrayList<>();
        for (PatrolRegion region : regionList) {
            regions.add(region.getRegionId());
        }
        List<MobileRepairOrderDto> mobileRepairOrderDtoList = new ArrayList<>();
        List<RepairOrder> repairOrderList = mobileMapper.getRepairOrderWithEqInUse(regions);
        for (RepairOrder repairOrder : repairOrderList) {
            MobileRepairOrderDto dto = new MobileRepairOrderDto();
            dto.setId(String.valueOf(repairOrder.getId()));
            dto.setDevice_id(repairOrder.getEq_id());
            EqType eqType = eqTypeMapper.selectByPrimaryKey(
                    eqInUseMapper.selectByPrimaryKey(
                            Integer.parseInt(repairOrder.getEq_id())).getId());
            dto.setDevice_type(eqType.getTypeName());
            dto.setDevice_model(eqType.getModelNumber());
            dto.setAddress(repairOrder.getEq_in_use().getAddress());
            Map<String, Double> pos = new HashMap<>();
            pos.put("latitude", repairOrder.getEq_in_use().getLatitude());
            pos.put("longtitude", repairOrder.getEq_in_use().getLongitude());
            dto.setPosition(pos);
            dto.setUrl(repairOrder.getReport_picture());
            dto.setDetail(repairOrder.getDescription());
            dto.setPhone(repairOrder.getTel_number());
            mobileRepairOrderDtoList.add(dto);
        }
        Result result = Result.success();
        result.setData(mobileRepairOrderDtoList);
        return result;
    }
}
