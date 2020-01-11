package com.jxc.service;

import com.jxc.dao.AskleaveMapper;
import com.jxc.pojo.Askleave;
import com.jxc.pojo.AskleaveExample;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AskleaveServiceImpl implements AskleaveService {

    @Setter
    @Autowired
    private AskleaveMapper askleaveMapper;

    @Override
    public long countByExample(AskleaveExample example) {
        return askleaveMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AskleaveExample example) {
        return askleaveMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer lno) {
        return askleaveMapper.deleteByPrimaryKey(lno);
    }

    @Override
    public int insert(Askleave record) {
        return askleaveMapper.insert(record);
    }

    @Override
    public int insertSelective(Askleave record) {
        return askleaveMapper.insertSelective(record);
    }

    @Override
    public List<Askleave> selectByExample(AskleaveExample example) {
        return askleaveMapper.selectByExample(example);
    }

    @Override
    public Askleave selectByPrimaryKey(Integer lno) {
        return askleaveMapper.selectByPrimaryKey(lno);
    }

    @Override
    public int updateByExampleSelective(Askleave record, AskleaveExample example) {
        return askleaveMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Askleave record, AskleaveExample example) {
        return askleaveMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Askleave record) {
        return askleaveMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Askleave record) {
        return askleaveMapper.updateByPrimaryKey(record);
    }
}
