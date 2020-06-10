package org.sse.eport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sse.eport.Basic.Result;
import org.sse.eport.dto.MobileRepairOrderPutReciever;
import org.sse.eport.dto.MobileWorkOrderReciever;
import org.sse.eport.service.MobileService;

/**
 * @author ZTL
 */
@Controller
@RequestMapping("api/mobile")
public class MobileController {
    @Autowired
    private MobileService mobileService;
    @PostMapping("/postrepairOrder")
    public Result postRepairOrder(MobileRepairOrderPutReciever mobileRepairOrderReciever){
        return mobileService.postRepairOrder(mobileRepairOrderReciever);
    }

    @PostMapping("/putrepairOrder")
    public Result putRepairOrder(MobileRepairOrderPutReciever reciever){
        return mobileService.putRepairOrder(reciever);
    }

    @PostMapping("/workOrder")
    public Result postWorkOrder(MobileWorkOrderReciever mobileWorkOrderReciever){
        return mobileService.postWorkOrder(mobileWorkOrderReciever);
    }
}
