package com.his.controller;

import com.his.entity.Register;
import com.his.service.IRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("addregister")
public class RegisterController {

    @Autowired
    private IRegisterService registerService;

    @RequestMapping("list")
    @ResponseBody
    public List<Register> list(){
        return registerService.getlist();
    }

    @RequestMapping(value = "tosubmit",method = RequestMethod.POST)
    public void submit(Register register){
        registerService.submit(register);
    }

    @RequestMapping(value = "getinfolist",method = RequestMethod.GET)
    @ResponseBody
    public List<Register> infolist(String casenumber){
        System.out.println(casenumber);
        return registerService.getinfolist(casenumber);
    }

    @RequestMapping(value = "getinfo",method = RequestMethod.GET)
    @ResponseBody
    public Register info(String casenumber){
        return registerService.getinfo(casenumber);
    }
}
