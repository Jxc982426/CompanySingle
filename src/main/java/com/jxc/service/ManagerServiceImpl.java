package com.jxc.service;

import com.jxc.dao.ManagerMapper;
import com.jxc.pojo.Manager;
import com.jxc.pojo.ManagerExample;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Setter
    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public long countByExample(ManagerExample example) {
        return managerMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ManagerExample example) {
        return managerMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer mid) {
        return managerMapper.deleteByPrimaryKey(mid);
    }

    @Override
    public int insert(Manager record) {
        return managerMapper.insert(record);
    }

    @Override
    public int insertSelective(Manager record) {
        return managerMapper.insertSelective(record);
    }

    @Override
    public List<Manager> selectByExample(ManagerExample example) {
        return managerMapper.selectByExample(example);
    }

    @Override
    public Manager selectByPrimaryKey(Integer mid) {
        return managerMapper.selectByPrimaryKey(mid);
    }

    @Override
    public int updateByExampleSelective(Manager record, ManagerExample example) {
        return managerMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Manager record, ManagerExample example) {
        return managerMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Manager record) {
        return managerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Manager record) {
        return managerMapper.updateByPrimaryKey(record);
    }
}
