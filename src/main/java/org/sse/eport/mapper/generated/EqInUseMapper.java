package org.sse.eport.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sse.eport.pojo.EqInUse;
import org.sse.eport.pojo.EqInUseExample;

public interface EqInUseMapper {
    int countByExample(EqInUseExample example);

    int deleteByExample(EqInUseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EqInUse record);

    int insertSelective(EqInUse record);

    List<EqInUse> selectByExample(EqInUseExample example);

    EqInUse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EqInUse record, @Param("example") EqInUseExample example);

    int updateByExample(@Param("record") EqInUse record, @Param("example") EqInUseExample example);

    int updateByPrimaryKeySelective(EqInUse record);

    int updateByPrimaryKey(EqInUse record);
}