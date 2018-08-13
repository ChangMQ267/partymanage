package com.changmq.partymanager.DAO;

import com.changmq.partymanager.domain.PartyIntroducer;
import com.changmq.partymanager.domain.PartyIntroducerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyIntroducerMapper {
    int countByExample(PartyIntroducerExample example);

    int deleteByExample(PartyIntroducerExample example);

    int deleteByPrimaryKey(Integer piId);

    int insert(PartyIntroducer record);

    int insertSelective(PartyIntroducer record);

    List<PartyIntroducer> selectByExample(PartyIntroducerExample example);

    PartyIntroducer selectByPrimaryKey(Integer piId);

    int updateByExampleSelective(@Param("record") PartyIntroducer record, @Param("example") PartyIntroducerExample example);

    int updateByExample(@Param("record") PartyIntroducer record, @Param("example") PartyIntroducerExample example);

    int updateByPrimaryKeySelective(PartyIntroducer record);

    int updateByPrimaryKey(PartyIntroducer record);
}