package com.jxc.dao;

import com.jxc.pojo.Askleave;
import com.jxc.pojo.AskleaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AskleaveMapper {
    long countByExample(AskleaveExample example);

    int deleteByExample(AskleaveExample example);

    int deleteByPrimaryKey(Integer lno);

    int insert(Askleave record);

    int insertSelective(Askleave record);

    List<Askleave> selectByExample(AskleaveExample example);

    Askleave selectByPrimaryKey(Integer lno);

    int updateByExampleSelective(@Param("record") Askleave record, @Param("example") AskleaveExample example);

    int updateByExample(@Param("record") Askleave record, @Param("example") AskleaveExample example);

    int updateByPrimaryKeySelective(Askleave record);

    int updateByPrimaryKey(Askleave record);
}