package com.springboot.service.impl;

import com.springboot.bean.Student;
import com.springboot.dao.TestDao;
import com.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    TestDao testDao;

    @Override
    public boolean save(Student student) {
        return testDao.insert(student)>0;
    }

    @Override
    public boolean update(Student student) {
        return testDao.updateById(student)>0;
    }

    @Override
    public boolean deleteById(Integer id) {
        return testDao.deleteById(id)>0;
    }

    @Override
    public Student getById(Integer id) {
        return testDao.selectById(id);
    }

    @Override
    public List<Student> getAll() {
        return testDao.selectList(null);
    }
}
