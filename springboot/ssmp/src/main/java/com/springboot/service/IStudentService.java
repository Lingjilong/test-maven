package com.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springboot.bean.Student;

public interface IStudentService extends IService<Student> {
    Student getByName(String name);
}
