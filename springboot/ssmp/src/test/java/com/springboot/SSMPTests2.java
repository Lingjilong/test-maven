package com.springboot;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.bean.Student;
import com.springboot.dao.TestDao;
import com.springboot.service.impl.IStudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;


@SpringBootTest
class SSMPTests2 {

    @Autowired
    private IStudentServiceImpl service;

    @Test
    void save(){
        Student s1 = new Student();
        s1.setName("小明");
        s1.setBirth(new Date());
        Student s2 = new Student();
        s2.setName("大明");
        s2.setBirth(new Date());
        service.save(s1);
        service.save(s2);
    }
    @Test
    void updateById() {
        Student s1 = service.getByName("小明");
        s1.setName("大头");
        service.updateById(s1);

    }

    @Test
    void removeById() {
        Student s1 = service.getByName("大头");
        service.removeById(s1.getId());
    }
    @Test
    void getAll() {
       service.list();
    }

    @Test
    void getPage() {
        IPage page = new Page(1,4);
        service.page(page);
    }
}
