package com.jxc.pojo;

import java.io.Serializable;

public class Transfer implements Serializable {
    private Integer tno;

    private Integer eno;

    private Integer olddno;

    private Integer newdno;

    private static final long serialVersionUID = 1L;

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public Integer getOlddno() {
        return olddno;
    }

    public void setOlddno(Integer olddno) {
        this.olddno = olddno;
    }

    public Integer getNewdno() {
        return newdno;
    }

    public void setNewdno(Integer newdno) {
        this.newdno = newdno;
    }
}