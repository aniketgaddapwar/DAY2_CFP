package com.bridgelabz.HellowWorldApp.controller;

import com.bridgelabz.HellowWorldApp.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hellow")
public class HellowController {

    @GetMapping(value = {"/",""})
    public String sayhello(){
        return "hello from spring boot";
    }
    @GetMapping("/query")
    public String sayhello(@RequestParam(value = "name")String name){
      return "hellow" +name + "from springboot";
    }
    @GetMapping("/path/{name}")
    public String sayhellopath(@PathVariable String name){
        return "hello" + name + "From Springboot";
    }
    @PostMapping("post")
    public String sayhellow(@RequestBody User user){
        return "hello"+" " +user.getFirstName()+ " "+ user.getLastName()+ " "+ "From Bridgelabz";
    }


}
