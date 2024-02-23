package com.springboot.dao;

import com.springboot.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestDao {
    @Select("select * from test where tid = #{id}")
    Student getById(Integer id);
    @Select("select * from test")
    List<Student> getAllStudent();

}
