package org.sse.eport.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.sse.eport.entity.AccessoryStored;
import org.sse.eport.entity.EqStored;

import java.util.List;

/**
 * @author cbc
 */
@Component
@Mapper
public interface RepairSheetMapper {

    @Select("select * from eq_stored left join warehouse w on eq_stored.WAREHOUSE_ID = w.ID\n" +
            "where eq_stored.EQ_TYPE_ID=#{id}")
    List<EqStored> selectEqStoredByTypeId(@Param("id") int id);

    @Select("select * from accessory_stored left join warehouse w on accessory_stored.WAREHOUSE_ID = w.ID\n" +
            "where accessory_stored.EQ_TYPE_ID=#{id}")
    List<AccessoryStored> selectAcStoredByTypeId(@Param("id") int id);
}
