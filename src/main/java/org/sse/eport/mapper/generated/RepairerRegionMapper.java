package org.sse.eport.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sse.eport.pojo.RepairerRegion;
import org.sse.eport.pojo.RepairerRegionExample;
import org.sse.eport.pojo.RepairerRegionKey;

public interface RepairerRegionMapper {
    int countByExample(RepairerRegionExample example);

    int deleteByExample(RepairerRegionExample example);

    int deleteByPrimaryKey(RepairerRegionKey key);

    int insert(RepairerRegion record);

    int insertSelective(RepairerRegion record);

    List<RepairerRegion> selectByExample(RepairerRegionExample example);

    RepairerRegion selectByPrimaryKey(RepairerRegionKey key);

    int updateByExampleSelective(@Param("record") RepairerRegion record, @Param("example") RepairerRegionExample example);

    int updateByExample(@Param("record") RepairerRegion record, @Param("example") RepairerRegionExample example);

    int updateByPrimaryKeySelective(RepairerRegion record);

    int updateByPrimaryKey(RepairerRegion record);
}