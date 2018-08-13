package com.changmq.partymanager.DAO;

import com.changmq.partymanager.domain.Parent;
import com.changmq.partymanager.domain.ParentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParentMapper {
    int countByExample(ParentExample example);

    int deleteByExample(ParentExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(Parent record);

    int insertSelective(Parent record);

    List<Parent> selectByExample(ParentExample example);

    Parent selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") Parent record, @Param("example") ParentExample example);

    int updateByExample(@Param("record") Parent record, @Param("example") ParentExample example);

    int updateByPrimaryKeySelective(Parent record);

    int updateByPrimaryKey(Parent record);
}