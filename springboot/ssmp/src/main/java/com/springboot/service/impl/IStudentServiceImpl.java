package com.springboot.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.bean.Student;
import com.springboot.dao.TestDao;
import com.springboot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IStudentServiceImpl extends ServiceImpl<TestDao, Student> implements IStudentService {
    @Autowired TestDao testDao;

    @Override
    public Student getByName(String name) {
        return testDao.getByName(name);
    }

    @Override
    public Page<String > getPage(Integer currentPage, Integer pageSize) {
        Page page = new Page<>(currentPage, pageSize);
        Page page1 = testDao.selectPage(page, null);
        return page1;
    }


}
