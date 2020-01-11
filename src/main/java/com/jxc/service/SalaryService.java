package com.jxc.service;

import com.jxc.pojo.Salary;
import com.jxc.pojo.SalaryExample;

import java.util.List;

public interface SalaryService {
    long countByExample(SalaryExample example);

    int deleteByExample(SalaryExample example);

    int deleteByPrimaryKey(Integer sno);

    int insert(Salary record);

    int insertSelective(Salary record);

    List<Salary> selectByExample(SalaryExample example);

    Salary selectByPrimaryKey(Integer sno);

    int updateByExampleSelective(Salary record, SalaryExample example);

    int updateByExample(Salary record, SalaryExample example);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);
}
