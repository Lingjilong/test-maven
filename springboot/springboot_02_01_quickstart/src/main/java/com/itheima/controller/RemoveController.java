package com.itheima.controller;

import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/removes")
public class RemoveController {
    /* @GetMapping
    public String getById(){
        System.out.println("springboot 0101 is running now");
        return "springboot 0101 is running now";
    }*/
    @GetMapping(value = "/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println(id + "have find");
        return id + "have find";
    }
    @GetMapping
    public String getAll(){
        System.out.println("All user have find");
        return "All user have find";
    }
    @PostMapping
    public String save(){
        System.out.println("save now");
        return "save now";
    }
    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println(id+"is delete");
        return id+"is delete";
    }
   @PutMapping
    public String update(@RequestBody String string){
        System.out.println(string + "is update");
        return string + "is update";
    }

}
