package com.jxc.pojo;

import java.io.Serializable;

public class Salary implements Serializable {
    private Integer sno;

    private Integer eno;

    private Integer dno;

    private Double msal;

    private Double ysal;

    private Double award;

    private Integer sgrade;

    private static final long serialVersionUID = 1L;

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

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

    public Double getMsal() {
        return msal;
    }

    public void setMsal(Double msal) {
        this.msal = msal;
    }

    public Double getYsal() {
        return ysal;
    }

    public void setYsal(Double ysal) {
        this.ysal = ysal;
        if (ysal < 5000){
            this.setSgrade(3);
        }else if (ysal < 8000){
            this.setSgrade(2);
        }else{
            this.setSgrade(1);
        }
    }

    public Double getAward() {
        return award;
    }

    public void setAward(Double award) {
        this.award = award;
    }

    public Integer getSgrade() {
        return sgrade;
    }

    public void setSgrade(Integer sgrade) {
        this.sgrade = sgrade;
    }
}