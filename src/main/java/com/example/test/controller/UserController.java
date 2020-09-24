package com.example.test.controller;

import com.example.test.model.User;
import com.example.test.service.User.IntUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Autowired
    private IntUserService intUserService;

    @RequestMapping(value = "/loginIn")
    @ResponseBody
    public String login(String name,String pwd){
        System.out.println(name+"控制层"+pwd);
        User user=intUserService.getuser(name,pwd);
        if(user!=null){
            return "success";
        }else{
            return "error";
        }

    }

    public void test(){
        System.out.println("做提交测试");
    }
}
