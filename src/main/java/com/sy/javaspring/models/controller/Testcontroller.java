package com.sy.javaspring.models.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("tc")
public class Testcontroller {


    @GetMapping("xxx")
    @ResponseBody
    public  String test(){
        return "hello";
    }
}
