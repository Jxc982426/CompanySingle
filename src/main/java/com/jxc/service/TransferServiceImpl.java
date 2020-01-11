package com.jxc.service;

import com.jxc.dao.TransferMapper;
import com.jxc.pojo.Transfer;
import com.jxc.pojo.TransferExample;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferServiceImpl implements TransferService {
    @Setter
    @Autowired
    private TransferMapper transferMapper;

    @Override
    public long countByExample(TransferExample example) {
        return transferMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TransferExample example) {
        return transferMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer tno) {
        return transferMapper.deleteByPrimaryKey(tno);
    }

    @Override
    public int insert(Transfer record) {
        return transferMapper.insert(record);
    }

    @Override
    public int insertSelective(Transfer record) {
        return transferMapper.insertSelective(record);
    }

    @Override
    public List<Transfer> selectByExample(TransferExample example) {
        return transferMapper.selectByExample(example);
    }

    @Override
    public Transfer selectByPrimaryKey(Integer tno) {
        return transferMapper.selectByPrimaryKey(tno);
    }

    @Override
    public int updateByExampleSelective(Transfer record, TransferExample example) {
        return transferMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Transfer record, TransferExample example) {
        return transferMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Transfer record) {
        return transferMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Transfer record) {
        return transferMapper.updateByPrimaryKey(record);
    }
}
