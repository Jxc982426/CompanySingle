package com.jxc.service;

import com.jxc.pojo.Business;
import com.jxc.pojo.BusinessExample;

import java.util.List;

public interface BusinessService {
    long countByExample(BusinessExample example);

    int deleteByExample(BusinessExample example);

    int deleteByPrimaryKey(Integer bno);

    int insert(Business record);

    int insertSelective(Business record);

    List<Business> selectByExample(BusinessExample example);

    Business selectByPrimaryKey(Integer bno);

    int updateByExampleSelective(Business record, BusinessExample example);

    int updateByExample(Business record, BusinessExample example);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKey(Business record);
}
