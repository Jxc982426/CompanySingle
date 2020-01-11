package com.jxc.service;

import com.jxc.pojo.Attendance;
import com.jxc.pojo.AttendanceExample;

import java.util.List;

public interface AttendanceService {
    long countByExample(AttendanceExample example);

    int deleteByExample(AttendanceExample example);

    int insert(Attendance record);

    int insertSelective(Attendance record);

    List<Attendance> selectByExample(AttendanceExample example);

    int updateByExampleSelective(Attendance record, AttendanceExample example);

    int updateByExample(Attendance record, AttendanceExample example);
}
