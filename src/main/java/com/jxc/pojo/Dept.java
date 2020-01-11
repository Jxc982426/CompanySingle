package com.jxc.pojo;

import java.io.Serializable;

public class Dept implements Serializable {
    private Integer dno;

    private String dname;

    private Integer pnumber;

    private static final long serialVersionUID = 1L;

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public Integer getPnumber() {
        return pnumber;
    }

    public void setPnumber(Integer pnumber) {
        this.pnumber = pnumber;
    }
}