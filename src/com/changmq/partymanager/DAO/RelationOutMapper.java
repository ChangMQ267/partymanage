package com.changmq.partymanager.DAO;

import com.changmq.partymanager.domain.RelationOut;
import com.changmq.partymanager.domain.RelationOutExample;
import com.changmq.partymanager.domain.RelationOutWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationOutMapper {
    int countByExample(RelationOutExample example);

    int deleteByExample(RelationOutExample example);

    int deleteByPrimaryKey(Integer rOutId);

    int insert(RelationOutWithBLOBs record);

    int insertSelective(RelationOutWithBLOBs record);

    List<RelationOutWithBLOBs> selectByExampleWithBLOBs(RelationOutExample example);

    List<RelationOut> selectByExample(RelationOutExample example);

    RelationOutWithBLOBs selectByPrimaryKey(Integer rOutId);

    int updateByExampleSelective(@Param("record") RelationOutWithBLOBs record, @Param("example") RelationOutExample example);

    int updateByExampleWithBLOBs(@Param("record") RelationOutWithBLOBs record, @Param("example") RelationOutExample example);

    int updateByExample(@Param("record") RelationOut record, @Param("example") RelationOutExample example);

    int updateByPrimaryKeySelective(RelationOutWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RelationOutWithBLOBs record);

    int updateByPrimaryKey(RelationOut record);
}