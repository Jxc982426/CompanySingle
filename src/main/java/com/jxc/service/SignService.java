package com.jxc.service;

import com.jxc.pojo.Sign;
import com.jxc.pojo.SignExample;

import java.util.List;

public interface SignService {
    long countByExample(SignExample example);

    int deleteByExample(SignExample example);

    int insert(Sign record);

    int insertSelective(Sign record);

    List<Sign> selectByExample(SignExample example);

    int updateByExampleSelective(Sign record, SignExample example);

    int updateByExample(Sign record, SignExample example);
}
