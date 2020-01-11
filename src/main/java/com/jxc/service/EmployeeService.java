package com.jxc.service;

import com.jxc.pojo.Employee;
import com.jxc.pojo.EmployeeExample;

import java.util.List;

public interface EmployeeService {
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer eno);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Integer eno);

    int updateByExampleSelective(Employee record, EmployeeExample example);

    int updateByExample(Employee record, EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}
