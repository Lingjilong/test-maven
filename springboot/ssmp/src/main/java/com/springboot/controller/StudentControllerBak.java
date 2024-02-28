package com.springboot.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.bean.Student;
import com.springboot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/students")
public class StudentControllerBak {
    @Autowired
    IStudentService iStudentService;
    @PostMapping
    public boolean save(@RequestBody  Student student){
        return iStudentService.save(student);
    }

    @PutMapping
    public boolean update(@RequestBody  Student student){
        return iStudentService.updateById(student);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id){
        return iStudentService.removeById(id);
    }

    @GetMapping("{id}")
    public Student getById(@PathVariable Integer id){
        return iStudentService.getById(id);
    }

    @GetMapping
    public List<Student> getAll(){
        return iStudentService.list();
    }

    @GetMapping("{currentPage}/{pageSize}")
    public Page getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize){
        return iStudentService.getPage(currentPage,pageSize);
    }


}
