package com.jxc.service;

import com.jxc.dao.DeptMapper;
import com.jxc.pojo.Dept;
import com.jxc.pojo.DeptExample;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Setter
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public long countByExample(DeptExample example) {
        return deptMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DeptExample example) {
        return deptMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer dno) {
        return deptMapper.deleteByPrimaryKey(dno);
    }

    @Override
    public int insert(Dept record) {
        return deptMapper.insert(record);
    }

    @Override
    public int insertSelective(Dept record) {
        return deptMapper.insertSelective(record);
    }

    @Override
    public List<Dept> selectByExample(DeptExample example) {
        return deptMapper.selectByExample(example);
    }

    @Override
    public Dept selectByPrimaryKey(Integer dno) {
        return deptMapper.selectByPrimaryKey(dno);
    }

    @Override
    public int updateByExampleSelective(Dept record, DeptExample example) {
        return deptMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Dept record, DeptExample example) {
        return deptMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Dept record) {
        return deptMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Dept record) {
        return deptMapper.updateByPrimaryKey(record);
    }
}
