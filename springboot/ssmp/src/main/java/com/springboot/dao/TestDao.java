package com.springboot.dao;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface TestDao extends BaseMapper<Student> {
    @Select("select * from student where name = #{name}")
    Student getByName(String name);
}
