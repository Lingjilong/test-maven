package com.itheima.controller;

import com.itheima.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${otherAddress}")
    private String otherAddress;

    @Autowired
    private Environment environment;

    @Value("${likes[1]}")
    private String like1;
    @Autowired
    private Student student;

    @GetMapping
    public String getAll(){
        System.out.println(otherAddress);
        System.out.println("----");
        System.out.println(environment.getProperty("otherAddress"));
        System.out.println(like1);
        System.out.println(student);
        return "SpringBoot Running!!!";
    }
}
