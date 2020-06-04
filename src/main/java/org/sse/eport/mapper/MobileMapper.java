package org.sse.eport.mapper;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.sse.eport.entity.EqInUse;
import org.sse.eport.entity.RepairOrder;

/**
 * @author ZTL
 */
@Component
@Mapper
public interface MobileMapper {
    @Select("select * " +
            "from eq_in_use " +
            "where id = #{id}")
    EqInUse findEqInUseById(@Param("id")String id);

    @Insert("insert into repair_order(id,report_picture,repair_type," +
            "description,status,tel_number,eq_id,dispatcher_id,insert_by," +
            "update_by,insert_time,update_time) " +
            "values(#{id},#{report_picture},#{repair_type}," +
            "#{description},#{status},#{tel_number},#{eq_id},#{dispatcher_id},#{insert_by}," +
            "#{update_by},#{insert_time},#{update_time})")
    Boolean addRepairOrder(RepairOrder repairOrder);

    @Update("update eq_in_use " +
            "set status = #{status} " +
            "where id = #{id}")
    Boolean updateStatusOfEqInUse(@Param("id")String id,@Param("status")String status);

    @Select("select * " +
            "from repair_order " +
            "where id = #{id}")
    RepairOrder findRepairOrderById(@Param("id")String id);

    @Update("update repair_order " +
            "set eq_id = #{eq_id},report_picture= #{report_picture}," +
            "description= #{description},tel_number= #{tel_number}," +
            "repair_type= #{repair_type},status= #{status} " +
            "where id = #{id}")
    Boolean updateRepairOrder(RepairOrder repairOrder);
}
