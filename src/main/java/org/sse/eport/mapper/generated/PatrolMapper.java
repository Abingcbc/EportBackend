package org.sse.eport.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sse.eport.pojo.Patrol;
import org.sse.eport.pojo.PatrolExample;

public interface PatrolMapper {
    int countByExample(PatrolExample example);

    int deleteByExample(PatrolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Patrol record);

    int insertSelective(Patrol record);

    List<Patrol> selectByExample(PatrolExample example);

    Patrol selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Patrol record, @Param("example") PatrolExample example);

    int updateByExample(@Param("record") Patrol record, @Param("example") PatrolExample example);

    int updateByPrimaryKeySelective(Patrol record);

    int updateByPrimaryKey(Patrol record);
}