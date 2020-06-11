package org.sse.eport.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sse.eport.pojo.AccessoryStored;
import org.sse.eport.pojo.AccessoryStoredExample;
import org.sse.eport.pojo.AccessoryStoredKey;

public interface AccessoryStoredMapper {
    int countByExample(AccessoryStoredExample example);

    int deleteByExample(AccessoryStoredExample example);

    int deleteByPrimaryKey(AccessoryStoredKey key);

    int insert(AccessoryStored record);

    int insertSelective(AccessoryStored record);

    List<AccessoryStored> selectByExample(AccessoryStoredExample example);

    AccessoryStored selectByPrimaryKey(AccessoryStoredKey key);

    int updateByExampleSelective(@Param("record") AccessoryStored record, @Param("example") AccessoryStoredExample example);

    int updateByExample(@Param("record") AccessoryStored record, @Param("example") AccessoryStoredExample example);

    int updateByPrimaryKeySelective(AccessoryStored record);

    int updateByPrimaryKey(AccessoryStored record);
}