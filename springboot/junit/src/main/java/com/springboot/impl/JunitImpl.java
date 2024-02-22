package com.springboot.impl;

import com.springboot.dao.JunitDao;
import org.springframework.stereotype.Repository;

@Repository
public class JunitImpl implements JunitDao {
    @Override
    public void print() {
        System.out.println("test Junit......");
    }
}
