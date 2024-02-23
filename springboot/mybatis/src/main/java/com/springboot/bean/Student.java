package com.springboot.bean;

import java.util.Date;

public class Student {
    private Integer tid;
    private String tname;
    private Date birth;

    @Override
    public String toString() {
        return "Student{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", birth=" + birth +
                '}';
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
