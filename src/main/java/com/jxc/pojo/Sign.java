package com.jxc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Sign implements Serializable {
    private Integer id;

    private Integer eno;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date firstsign;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastsign;

    private Integer signweek;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date signdate;

    private String late;

    private String leaveearly;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public Date getFirstsign() {
        return firstsign;
    }

    public void setFirstsign(Date firstsign) {
        this.firstsign = firstsign;
    }

    public Date getLastsign() {
        return lastsign;
    }

    public void setLastsign(Date lastsign) {
        this.lastsign = lastsign;
    }

    public Integer getSignweek() {
        return signweek;
    }

    public void setSignweek(Integer signweek) {
        this.signweek = signweek;
    }

    public Date getSigndate() {
        return signdate;
    }

    public void setSigndate(Date signdate) {
        this.signdate = signdate;
    }

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late == null ? null : late.trim();
    }

    public String getLeaveearly() {
        return leaveearly;
    }

    public void setLeaveearly(String leaveearly) {
        this.leaveearly = leaveearly == null ? null : leaveearly.trim();
    }
}