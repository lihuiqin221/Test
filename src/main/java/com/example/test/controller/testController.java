package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController{
    @RequestMapping("index")
    public String test(){
        return "index";
    }
}
