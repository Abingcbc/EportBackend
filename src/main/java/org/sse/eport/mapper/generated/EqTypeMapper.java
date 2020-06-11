package org.sse.eport.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sse.eport.pojo.EqType;
import org.sse.eport.pojo.EqTypeExample;

public interface EqTypeMapper {
    int countByExample(EqTypeExample example);

    int deleteByExample(EqTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EqType record);

    int insertSelective(EqType record);

    List<EqType> selectByExample(EqTypeExample example);

    EqType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EqType record, @Param("example") EqTypeExample example);

    int updateByExample(@Param("record") EqType record, @Param("example") EqTypeExample example);

    int updateByPrimaryKeySelective(EqType record);

    int updateByPrimaryKey(EqType record);
}