package com.springboot.controller;

import com.springboot.bean.Student;
import com.springboot.utils.ResultMaker;
import com.springboot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    IStudentService iStudentService;
    @PostMapping
    public ResultMaker save(@RequestBody  Student student) throws Exception{
        boolean save = iStudentService.save(student);
        return new ResultMaker(save, save ? "success":"fail");
    }

    @PutMapping
    public ResultMaker update(@RequestBody  Student student){
        return new ResultMaker(iStudentService.updateById(student));
    }

    @DeleteMapping("{id}")
    public ResultMaker delete(@PathVariable Integer id){
        return new ResultMaker(iStudentService.removeById(id));
    }

    @GetMapping("{id}")
    public ResultMaker getById(@PathVariable Integer id){
        return new ResultMaker(true,iStudentService.getById(id));
    }

    @GetMapping
    public ResultMaker getAll(){
        return new ResultMaker(true,iStudentService.list());
    }

    @GetMapping("{currentPage}/{pageSize}")
    public ResultMaker getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize){
        return new ResultMaker(true,iStudentService.getPage(currentPage,pageSize));
    }


}
