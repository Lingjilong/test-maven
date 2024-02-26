package com.springboot.dao;

import com.springboot.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestDao {
    @Select("select * from student where id = #{id}")
    Student getById(Integer id);
    @Select("select * from student")
    List<Student> getAllStudent();

}
