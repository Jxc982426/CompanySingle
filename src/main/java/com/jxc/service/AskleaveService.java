package com.jxc.service;

import com.jxc.pojo.Askleave;
import com.jxc.pojo.AskleaveExample;

import java.util.List;

public interface AskleaveService {
    long countByExample(AskleaveExample example);

    int deleteByExample(AskleaveExample example);

    int deleteByPrimaryKey(Integer lno);

    int insert(Askleave record);

    int insertSelective(Askleave record);

    List<Askleave> selectByExample(AskleaveExample example);

    Askleave selectByPrimaryKey(Integer lno);

    int updateByExampleSelective(Askleave record, AskleaveExample example);

    int updateByExample( Askleave record, AskleaveExample example);

    int updateByPrimaryKeySelective(Askleave record);

    int updateByPrimaryKey(Askleave record);
}
