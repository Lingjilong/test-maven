package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
@RequestMapping("noNet")
public class NoNetController {
    @GetMapping
    public String getById(){
        System.out.println("springboot(no net) 0104 is running now");
        return "springboot(no net) 0104 is running now";
    }
}
