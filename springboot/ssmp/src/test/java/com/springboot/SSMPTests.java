package com.springboot;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.bean.Student;
import com.springboot.dao.TestDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class SSMPTests {

    @Autowired
    private TestDao testDao;
    @Test
    void contextLoads() {
        List<Student> students = testDao.selectList(null);
    }

    @Test
    void getById() {
        testDao.selectById(4);
    }

    @Test
    void getPage() {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","羊");
        IPage page = new Page(1,3);
        IPage page1 = testDao.selectPage(page, queryWrapper);
        List<Student> records = page1.getRecords();
        records.forEach(System.out::println);
    }
    @Test
    void wrapperQuery() {
        String name = "羊";
        //QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        //queryWrapper.eq("name","美羊羊");
        LambdaQueryWrapper<Student> queryWrapper = new LambdaQueryWrapper<Student>();
        //queryWrapper.like(Student::getName,name);
        queryWrapper.like(null != name,Student::getName,name);
        testDao.selectList(queryWrapper);

    }
}
