package com.springboot.utils;

import lombok.Data;

@Data
public class ResultMaker {
    boolean flag = false;
    Object data;
    String msg;

    public ResultMaker(){}
    public ResultMaker(boolean flag){
        this.flag = flag;
    }

    public ResultMaker(boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }

    public ResultMaker(boolean flag, String msg){
        this.flag = flag;
        this.msg = msg;
    }

    public ResultMaker(boolean flag,Object data, String msg){
        this.flag = flag;
        this.data = data;
        this.msg = msg;
    }

}
