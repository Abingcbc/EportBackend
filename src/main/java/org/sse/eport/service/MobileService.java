package org.sse.eport.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.sse.eport.Basic.Result;
import org.sse.eport.dto.MobileRepairOrderPutReciever;

/**
 * @author ZTL
 */
@Service
public class MobileService {
    public Result postRepairOrder(MobileRepairOrderPutReciever mobileRepairOrderReciever){
        //添加报修单
        return new Result();
    }

    public Result putRepairOrder(MobileRepairOrderPutReciever reciever){
        //修改报修单
        return new Result();
    }

    public Result getRepair(String id) {
        //查看报修单
        return new Result();
    }
}
