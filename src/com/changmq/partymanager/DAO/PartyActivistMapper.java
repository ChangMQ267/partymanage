package com.changmq.partymanager.DAO;

import com.changmq.partymanager.domain.PartyActivist;
import com.changmq.partymanager.domain.PartyActivistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyActivistMapper {
    int countByExample(PartyActivistExample example);

    int deleteByExample(PartyActivistExample example);

    int deleteByPrimaryKey(Integer paId);

    int insert(PartyActivist record);

    int insertSelective(PartyActivist record);

    List<PartyActivist> selectByExample(PartyActivistExample example);

    PartyActivist selectByPrimaryKey(Integer paId);

    int updateByExampleSelective(@Param("record") PartyActivist record, @Param("example") PartyActivistExample example);

    int updateByExample(@Param("record") PartyActivist record, @Param("example") PartyActivistExample example);

    int updateByPrimaryKeySelective(PartyActivist record);

    int updateByPrimaryKey(PartyActivist record);
}