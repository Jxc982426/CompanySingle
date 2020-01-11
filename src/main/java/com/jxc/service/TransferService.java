package com.jxc.service;

import com.jxc.pojo.Transfer;
import com.jxc.pojo.TransferExample;

import java.util.List;

public interface TransferService {
    long countByExample(TransferExample example);

    int deleteByExample(TransferExample example);

    int deleteByPrimaryKey(Integer tno);

    int insert(Transfer record);

    int insertSelective(Transfer record);

    List<Transfer> selectByExample(TransferExample example);

    Transfer selectByPrimaryKey(Integer tno);

    int updateByExampleSelective(Transfer record, TransferExample example);

    int updateByExample(Transfer record, TransferExample example);

    int updateByPrimaryKeySelective(Transfer record);

    int updateByPrimaryKey(Transfer record);
}
