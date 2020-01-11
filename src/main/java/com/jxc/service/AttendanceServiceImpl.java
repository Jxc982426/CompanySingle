package com.jxc.service;

import com.jxc.dao.AttendanceMapper;
import com.jxc.pojo.Attendance;
import com.jxc.pojo.AttendanceExample;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Setter
    @Autowired
    private AttendanceMapper attendanceMapper;

    @Override
    public long countByExample(AttendanceExample example) {
        return attendanceMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AttendanceExample example) {
        return attendanceMapper.deleteByExample(example);
    }

    @Override
    public int insert(Attendance record) {
        return attendanceMapper.insert(record);
    }

    @Override
    public int insertSelective(Attendance record) {
        return attendanceMapper.insertSelective(record);
    }

    @Override
    public List<Attendance> selectByExample(AttendanceExample example) {
        return attendanceMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(Attendance record, AttendanceExample example) {
        return attendanceMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Attendance record, AttendanceExample example) {
        return attendanceMapper.updateByExample(record, example);
    }
}
