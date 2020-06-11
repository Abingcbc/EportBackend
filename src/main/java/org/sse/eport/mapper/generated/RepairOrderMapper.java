package org.sse.eport.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.sse.eport.pojo.RepairOrder;
import org.sse.eport.pojo.RepairOrderExample;

@Component
public interface RepairOrderMapper {
    int countByExample(RepairOrderExample example);

    int deleteByExample(RepairOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepairOrder record);

    int insertSelective(RepairOrder record);

    List<RepairOrder> selectByExample(RepairOrderExample example);

    RepairOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepairOrder record, @Param("example") RepairOrderExample example);

    int updateByExample(@Param("record") RepairOrder record, @Param("example") RepairOrderExample example);

    int updateByPrimaryKeySelective(RepairOrder record);

    int updateByPrimaryKey(RepairOrder record);
}