package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class BookController {
   /* @GetMapping
    public String getById(){
        System.out.println("springboot 0101 is running now");
        return "springboot 0101 is running now";
    }*/
    @RequestMapping(value = "users/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println(id + "have find");
        return id + "have find";
    }
    @RequestMapping(value = "users",method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        System.out.println("All user have find");
        return "All user have find";
    }
    @RequestMapping(value = "users",method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("save now");
        return "save now";
    }
    @RequestMapping(value = "users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println(id+"is delete");
        return id+"is delete";
    }
    @RequestMapping(value = "users",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody String string){
        System.out.println(string + "is update");
        return string + "is update";
    }

    @RequestMapping(value = "output",method = RequestMethod.PUT)
    @ResponseBody
    public String Output(@RequestParam String AAA,String BBB,String CCC){
        System.out.println(AAA+CCC+BBB + "is update");
        return AAA+CCC+BBB + "is update";
    }
}
