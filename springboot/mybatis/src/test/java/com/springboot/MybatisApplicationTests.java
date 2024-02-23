package com.springboot;

import com.springboot.bean.Student;
import com.springboot.dao.TestDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    private TestDao testDao;
    @Test
    void contextLoads() {
        Student student = testDao.getById(2);
        System.out.println(student);
        System.out.println("***************************");
        List<Student> allStudent = testDao.getAllStudent();
        allStudent.forEach(a->{
            System.out.println(a);
        });
    }

}
