package com.his.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("sayhello")
    public String sayHello(){
        return "hello";
    }
}
