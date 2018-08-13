package com.changmq.partymanager.DAO;

import com.changmq.partymanager.domain.Dues;
import com.changmq.partymanager.domain.DuesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DuesMapper {
    int countByExample(DuesExample example);

    int deleteByExample(DuesExample example);

    int deleteByPrimaryKey(Integer dId);

    int insert(Dues record);

    int insertSelective(Dues record);

    List<Dues> selectByExample(DuesExample example);

    Dues selectByPrimaryKey(Integer dId);

    int updateByExampleSelective(@Param("record") Dues record, @Param("example") DuesExample example);

    int updateByExample(@Param("record") Dues record, @Param("example") DuesExample example);

    int updateByPrimaryKeySelective(Dues record);

    int updateByPrimaryKey(Dues record);
}