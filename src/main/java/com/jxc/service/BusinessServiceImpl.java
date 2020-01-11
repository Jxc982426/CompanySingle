package com.jxc.service;

import com.jxc.dao.BusinessMapper;
import com.jxc.pojo.Business;
import com.jxc.pojo.BusinessExample;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {
    @Setter
    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public long countByExample(BusinessExample example) {
        return businessMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BusinessExample example) {
        return businessMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer bno) {
        return businessMapper.deleteByPrimaryKey(bno);
    }

    @Override
    public int insert(Business record) {
        return businessMapper.insert(record);
    }

    @Override
    public int insertSelective(Business record) {
        return businessMapper.insertSelective(record);
    }

    @Override
    public List<Business> selectByExample(BusinessExample example) {
        return businessMapper.selectByExample(example);
    }

    @Override
    public Business selectByPrimaryKey(Integer bno) {
        return businessMapper.selectByPrimaryKey(bno);
    }

    @Override
    public int updateByExampleSelective(Business record, BusinessExample example) {
        return businessMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Business record, BusinessExample example) {
        return businessMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Business record) {
        return businessMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Business record) {
        return businessMapper.updateByPrimaryKey(record);
    }
}
