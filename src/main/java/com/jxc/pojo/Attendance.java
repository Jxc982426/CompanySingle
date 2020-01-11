package com.jxc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Attendance implements Serializable {
    private Integer eno;

    private Integer dno;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date checkmonth;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date checkdate;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startwork;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endwork;

    private Integer late;

    private Integer leaveearly;

    private static final long serialVersionUID = 1L;

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public Date getCheckmonth() {
        return checkmonth;
    }

    public void setCheckmonth(Date checkmonth) {
        this.checkmonth = checkmonth;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public Date getStartwork() {
        return startwork;
    }

    public void setStartwork(Date startwork) {
        this.startwork = startwork;
    }

    public Date getEndwork() {
        return endwork;
    }

    public void setEndwork(Date endwork) {
        this.endwork = endwork;
    }

    public Integer getLate() {
        return late;
    }

    public void setLate(Integer late) {
        this.late = late;
    }

    public Integer getLeaveearly() {
        return leaveearly;
    }

    public void setLeaveearly(Integer leaveearly) {
        this.leaveearly = leaveearly;
    }
}