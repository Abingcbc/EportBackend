package org.sse.eport.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sse.eport.pojo.EqTypeAccessory;
import org.sse.eport.pojo.EqTypeAccessoryExample;
import org.sse.eport.pojo.EqTypeAccessoryKey;

public interface EqTypeAccessoryMapper {
    int countByExample(EqTypeAccessoryExample example);

    int deleteByExample(EqTypeAccessoryExample example);

    int deleteByPrimaryKey(EqTypeAccessoryKey key);

    int insert(EqTypeAccessory record);

    int insertSelective(EqTypeAccessory record);

    List<EqTypeAccessory> selectByExample(EqTypeAccessoryExample example);

    EqTypeAccessory selectByPrimaryKey(EqTypeAccessoryKey key);

    int updateByExampleSelective(@Param("record") EqTypeAccessory record, @Param("example") EqTypeAccessoryExample example);

    int updateByExample(@Param("record") EqTypeAccessory record, @Param("example") EqTypeAccessoryExample example);

    int updateByPrimaryKeySelective(EqTypeAccessory record);

    int updateByPrimaryKey(EqTypeAccessory record);
}