package com.changmq.partymanager.DAO;

import com.changmq.partymanager.domain.PartyPosts;
import com.changmq.partymanager.domain.PartyPostsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartyPostsMapper {
    int countByExample(PartyPostsExample example);

    int deleteByExample(PartyPostsExample example);

    int deleteByPrimaryKey(Integer ppId);

    int insert(PartyPosts record);

    int insertSelective(PartyPosts record);

    List<PartyPosts> selectByExample(PartyPostsExample example);

    PartyPosts selectByPrimaryKey(Integer ppId);

    int updateByExampleSelective(@Param("record") PartyPosts record, @Param("example") PartyPostsExample example);

    int updateByExample(@Param("record") PartyPosts record, @Param("example") PartyPostsExample example);

    int updateByPrimaryKeySelective(PartyPosts record);

    int updateByPrimaryKey(PartyPosts record);
}