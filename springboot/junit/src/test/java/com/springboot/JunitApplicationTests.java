package com.springboot;

import com.springboot.dao.JunitDao;
import com.springboot.impl.JunitImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitApplicationTests {
@Autowired
private JunitDao junitDao;
    @Test
    void contextLoads() {
        System.out.println("test......");
        junitDao.print();
    }

}
