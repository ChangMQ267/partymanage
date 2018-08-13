package com.changmq.partymanager.DAO;

import com.changmq.partymanager.domain.CultivateContacts;
import com.changmq.partymanager.domain.CultivateContactsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CultivateContactsMapper {
    int countByExample(CultivateContactsExample example);

    int deleteByExample(CultivateContactsExample example);

    int deleteByPrimaryKey(Integer ccId);

    int insert(CultivateContacts record);

    int insertSelective(CultivateContacts record);

    List<CultivateContacts> selectByExample(CultivateContactsExample example);

    CultivateContacts selectByPrimaryKey(Integer ccId);

    int updateByExampleSelective(@Param("record") CultivateContacts record, @Param("example") CultivateContactsExample example);

    int updateByExample(@Param("record") CultivateContacts record, @Param("example") CultivateContactsExample example);

    int updateByPrimaryKeySelective(CultivateContacts record);

    int updateByPrimaryKey(CultivateContacts record);
}