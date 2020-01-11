package com.jxc.service;

import com.jxc.pojo.Dept;
import com.jxc.pojo.DeptExample;

import java.util.List;

public interface DeptService {
    long countByExample(DeptExample example);

    int deleteByExample(DeptExample example);

    int deleteByPrimaryKey(Integer dno);

    int insert(Dept record);

    int insertSelective(Dept record);

    List<Dept> selectByExample(DeptExample example);

    Dept selectByPrimaryKey(Integer dno);

    int updateByExampleSelective(Dept record, DeptExample example);

    int updateByExample(Dept record, DeptExample example);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}
