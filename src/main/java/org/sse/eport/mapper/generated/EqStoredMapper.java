package org.sse.eport.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sse.eport.pojo.EqStored;
import org.sse.eport.pojo.EqStoredExample;

public interface EqStoredMapper {
    int countByExample(EqStoredExample example);

    int deleteByExample(EqStoredExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EqStored record);

    int insertSelective(EqStored record);

    List<EqStored> selectByExample(EqStoredExample example);

    EqStored selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EqStored record, @Param("example") EqStoredExample example);

    int updateByExample(@Param("record") EqStored record, @Param("example") EqStoredExample example);

    int updateByPrimaryKeySelective(EqStored record);

    int updateByPrimaryKey(EqStored record);
}