package com.his.controller;

import com.his.entity.Medicalrecord;
import com.his.service.IMedicalreocrdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("medicalreocrd")
public class MedicalrecordController {

    @Autowired
    private IMedicalreocrdService medicalreocrdService;

    @RequestMapping(value = "addmedicalrecord",method = RequestMethod.POST)
    public void add(Medicalrecord medicalrecord){
        medicalreocrdService.addmedicalrecord(medicalrecord);
    }

}
