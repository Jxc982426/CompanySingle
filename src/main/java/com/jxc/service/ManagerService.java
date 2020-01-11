package com.jxc.service;

import com.jxc.pojo.Manager;
import com.jxc.pojo.ManagerExample;

import java.util.List;

public interface ManagerService {
    long countByExample(ManagerExample example);

    int deleteByExample(ManagerExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Manager record);

    int insertSelective(Manager record);

    List<Manager> selectByExample(ManagerExample example);

    Manager selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(Manager record, ManagerExample example);

    int updateByExample(Manager record, ManagerExample example);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}
