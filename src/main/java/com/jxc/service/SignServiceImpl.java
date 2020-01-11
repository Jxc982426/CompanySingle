package com.jxc.service;

import com.jxc.dao.SignMapper;
import com.jxc.pojo.Sign;
import com.jxc.pojo.SignExample;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignServiceImpl implements SignService {
    @Setter
    @Autowired
    private SignMapper signMapper;

    @Override
    public long countByExample(SignExample example) {
        return signMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SignExample example) {
        return signMapper.deleteByExample(example);
    }

    @Override
    public int insert(Sign record) {
        return signMapper.insert(record);
    }

    @Override
    public int insertSelective(Sign record) {
        return signMapper.insertSelective(record);
    }

    @Override
    public List<Sign> selectByExample(SignExample example) {
        return signMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(Sign record, SignExample example) {
        return signMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Sign record, SignExample example) {
        return signMapper.updateByExample(record, example);
    }
}
