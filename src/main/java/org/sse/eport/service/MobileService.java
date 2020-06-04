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
    public Result PostRepairOrder(MobileRepairOrderPutReciever mobileRepairOrderReciever){
        //添加报修单
        return new Result();
    }

    public Result PutRepairOrder(MobileRepairOrderPutReciever reciever){
        //修改报修单
        return new Result();
    }
}
