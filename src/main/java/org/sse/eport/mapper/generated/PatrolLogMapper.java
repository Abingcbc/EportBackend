package org.sse.eport.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sse.eport.pojo.PatrolLog;
import org.sse.eport.pojo.PatrolLogExample;

public interface PatrolLogMapper {
    int countByExample(PatrolLogExample example);

    int deleteByExample(PatrolLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PatrolLog record);

    int insertSelective(PatrolLog record);

    List<PatrolLog> selectByExample(PatrolLogExample example);

    PatrolLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PatrolLog record, @Param("example") PatrolLogExample example);

    int updateByExample(@Param("record") PatrolLog record, @Param("example") PatrolLogExample example);

    int updateByPrimaryKeySelective(PatrolLog record);

    int updateByPrimaryKey(PatrolLog record);
}