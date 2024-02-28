package com.springboot.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
    //可根据不同Exception 定义不同的拦截器，如 下方的 doOtherException
    @ExceptionHandler(Exception.class)
    public ResultMaker doException(Exception ex){
        ex.printStackTrace();
        return new ResultMaker(false,null,ex.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public ResultMaker doOtherException(RuntimeException ex){
        ex.printStackTrace();
        return new ResultMaker(false,null,ex.getMessage());
    }
}
