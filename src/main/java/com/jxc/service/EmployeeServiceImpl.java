package com.jxc.service;

import com.jxc.dao.EmployeeMapper;
import com.jxc.pojo.Employee;
import com.jxc.pojo.EmployeeExample;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Setter
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public long countByExample(EmployeeExample example) {
        return employeeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(EmployeeExample example) {
        return employeeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer eno) {
        return employeeMapper.deleteByPrimaryKey(eno);
    }

    @Override
    public int insert(Employee record) {
        return employeeMapper.insert(record);
    }

    @Override
    public int insertSelective(Employee record) {
        return employeeMapper.insertSelective(record);
    }

    @Override
    public List<Employee> selectByExample(EmployeeExample example) {
        return employeeMapper.selectByExample(example);
    }

    @Override
    public Employee selectByPrimaryKey(Integer eno) {
        return employeeMapper.selectByPrimaryKey(eno);
    }

    @Override
    public int updateByExampleSelective(Employee record, EmployeeExample example) {
        return employeeMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Employee record, EmployeeExample example) {
        return employeeMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Employee record) {
        return employeeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Employee record) {
        return employeeMapper.updateByPrimaryKey(record);
    }
}
