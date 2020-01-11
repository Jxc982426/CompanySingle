package com.jxc.service;

import com.jxc.pojo.Admin;
import com.jxc.pojo.AdminExample;

import java.util.List;

public interface AdminService {
    long countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(Admin record, AdminExample example);

    int updateByExample(Admin record, AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}
