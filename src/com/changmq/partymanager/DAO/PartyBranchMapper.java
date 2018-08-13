package com.changmq.partymanager.DAO;

import com.changmq.partymanager.domain.PartyBranch;
import com.changmq.partymanager.domain.PartyBranchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyBranchMapper {
    int countByExample(PartyBranchExample example);

    int deleteByExample(PartyBranchExample example);

    int deleteByPrimaryKey(Integer pbId);

    int insert(PartyBranch record);

    int insertSelective(PartyBranch record);

    List<PartyBranch> selectByExample(PartyBranchExample example);

    PartyBranch selectByPrimaryKey(Integer pbId);

    int updateByExampleSelective(@Param("record") PartyBranch record, @Param("example") PartyBranchExample example);

    int updateByExample(@Param("record") PartyBranch record, @Param("example") PartyBranchExample example);

    int updateByPrimaryKeySelective(PartyBranch record);

    int updateByPrimaryKey(PartyBranch record);
}