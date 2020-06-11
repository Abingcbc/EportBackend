package org.sse.eport.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sse.eport.pojo.Dispatcher;
import org.sse.eport.pojo.DispatcherExample;

public interface DispatcherMapper {
    int countByExample(DispatcherExample example);

    int deleteByExample(DispatcherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dispatcher record);

    int insertSelective(Dispatcher record);

    List<Dispatcher> selectByExample(DispatcherExample example);

    Dispatcher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dispatcher record, @Param("example") DispatcherExample example);

    int updateByExample(@Param("record") Dispatcher record, @Param("example") DispatcherExample example);

    int updateByPrimaryKeySelective(Dispatcher record);

    int updateByPrimaryKey(Dispatcher record);
}