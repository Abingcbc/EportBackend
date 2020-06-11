package org.sse.eport.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sse.eport.pojo.Repairer;
import org.sse.eport.pojo.RepairerExample;

public interface RepairerMapper {
    int countByExample(RepairerExample example);

    int deleteByExample(RepairerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Repairer record);

    int insertSelective(Repairer record);

    List<Repairer> selectByExample(RepairerExample example);

    Repairer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Repairer record, @Param("example") RepairerExample example);

    int updateByExample(@Param("record") Repairer record, @Param("example") RepairerExample example);

    int updateByPrimaryKeySelective(Repairer record);

    int updateByPrimaryKey(Repairer record);
}