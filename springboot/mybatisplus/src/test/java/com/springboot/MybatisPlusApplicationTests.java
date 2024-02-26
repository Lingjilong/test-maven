package com.springboot;

import com.springboot.bean.Student;
import com.springboot.dao.TestDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private TestDao testDao;
    @Test
    void contextLoads() {
        List<Student> students = testDao.selectList(null);
        System.out.println(students);
        System.out.println(testDao.selectById(2));
    }

}
