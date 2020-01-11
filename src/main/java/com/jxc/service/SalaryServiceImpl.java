package com.jxc.service;

import com.jxc.dao.SalaryMapper;
import com.jxc.pojo.Salary;
import com.jxc.pojo.SalaryExample;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Setter
    @Autowired
    private SalaryMapper salaryMapper;

    @Override
    public long countByExample(SalaryExample example) {
        return salaryMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SalaryExample example) {
        return salaryMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer sno) {
        return salaryMapper.deleteByPrimaryKey(sno);
    }

    @Override
    public int insert(Salary record) {
        return salaryMapper.insert(record);
    }

    @Override
    public int insertSelective(Salary record) {
        return salaryMapper.insertSelective(record);
    }

    @Override
    public List<Salary> selectByExample(SalaryExample example) {
        return salaryMapper.selectByExample(example);
    }

    @Override
    public Salary selectByPrimaryKey(Integer sno) {
        return salaryMapper.selectByPrimaryKey(sno);
    }

    @Override
    public int updateByExampleSelective(Salary record, SalaryExample example) {
        return salaryMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Salary record, SalaryExample example) {
        return salaryMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Salary record) {
        return salaryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Salary record) {
        return salaryMapper.updateByPrimaryKey(record);
    }
}
