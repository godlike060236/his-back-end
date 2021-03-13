package com.his.controller;

import com.his.entity.Drugsdetailed;
import com.his.service.IDrugsdetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("drugsdetailed")
public class DrugsdetailedController {

    @Autowired
    IDrugsdetailedService drugsdetailedService;

    @RequestMapping(value = "getdetail",method = RequestMethod.GET)
    @ResponseBody
    public List<Drugsdetailed> getdetails(int drugstempid){
        return drugsdetailedService.getdetail(drugstempid);
    }
}
