package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class NewController {
    @GetMapping
    public String getById(){
        System.out.println("springboot(aliyun) 0103 is running now");
        return "springboot(aliyun)  0103 is running now";
    }
}
