package org.sse.eport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sse.eport.Basic.Result;
import org.sse.eport.dto.MobileRepairOrderPutReciever;
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
    public Result PostRepairOrder(MobileRepairOrderPutReciever mobileRepairOrderReciever){
        return mobileService.PostRepairOrder(mobileRepairOrderReciever);
    }

    @PostMapping("/putrepairOrder")
    public Result PutRepairOrder(MobileRepairOrderPutReciever reciever){
        return mobileService.PostRepairOrder(reciever);
    }
}
