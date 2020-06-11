package org.sse.eport.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sse.eport.pojo.PatrolRegion;
import org.sse.eport.pojo.PatrolRegionExample;
import org.sse.eport.pojo.PatrolRegionKey;

public interface PatrolRegionMapper {
    int countByExample(PatrolRegionExample example);

    int deleteByExample(PatrolRegionExample example);

    int deleteByPrimaryKey(PatrolRegionKey key);

    int insert(PatrolRegion record);

    int insertSelective(PatrolRegion record);

    List<PatrolRegion> selectByExample(PatrolRegionExample example);

    PatrolRegion selectByPrimaryKey(PatrolRegionKey key);

    int updateByExampleSelective(@Param("record") PatrolRegion record, @Param("example") PatrolRegionExample example);

    int updateByExample(@Param("record") PatrolRegion record, @Param("example") PatrolRegionExample example);

    int updateByPrimaryKeySelective(PatrolRegion record);

    int updateByPrimaryKey(PatrolRegion record);
}