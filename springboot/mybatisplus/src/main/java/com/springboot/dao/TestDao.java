package com.springboot.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.springboot.bean.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao extends BaseMapper<Student> {


}
