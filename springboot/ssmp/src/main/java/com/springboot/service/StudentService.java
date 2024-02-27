package com.springboot.service;

import com.springboot.bean.Student;

import java.util.List;

public interface StudentService {
    boolean save(Student student);
    boolean update(Student student);
    boolean deleteById(Integer id);
    Student getById(Integer id);
    List<Student> getAll();
}
