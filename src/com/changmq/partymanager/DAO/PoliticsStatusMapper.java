package com.changmq.partymanager.DAO;

import com.changmq.partymanager.domain.PoliticsStatus;
import com.changmq.partymanager.domain.PoliticsStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoliticsStatusMapper {
    int countByExample(PoliticsStatusExample example);

    int deleteByExample(PoliticsStatusExample example);

    int deleteByPrimaryKey(Integer psId);

    int insert(PoliticsStatus record);

    int insertSelective(PoliticsStatus record);

    List<PoliticsStatus> selectByExample(PoliticsStatusExample example);

    PoliticsStatus selectByPrimaryKey(Integer psId);

    int updateByExampleSelective(@Param("record") PoliticsStatus record, @Param("example") PoliticsStatusExample example);

    int updateByExample(@Param("record") PoliticsStatus record, @Param("example") PoliticsStatusExample example);

    int updateByPrimaryKeySelective(PoliticsStatus record);

    int updateByPrimaryKey(PoliticsStatus record);
}