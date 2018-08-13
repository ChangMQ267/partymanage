package com.changmq.partymanager.DAO;

import com.changmq.partymanager.domain.PartyMenber;
import com.changmq.partymanager.domain.PartyMenberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyMenberMapper {
    int countByExample(PartyMenberExample example);

    int deleteByExample(PartyMenberExample example);

    int deleteByPrimaryKey(Integer pmId);

    int insert(PartyMenber record);

    int insertSelective(PartyMenber record);

    List<PartyMenber> selectByExample(PartyMenberExample example);

    PartyMenber selectByPrimaryKey(Integer pmId);

    int updateByExampleSelective(@Param("record") PartyMenber record, @Param("example") PartyMenberExample example);

    int updateByExample(@Param("record") PartyMenber record, @Param("example") PartyMenberExample example);

    int updateByPrimaryKeySelective(PartyMenber record);

    int updateByPrimaryKey(PartyMenber record);
}