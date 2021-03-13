package com.his.controller;

import com.his.entity.Prescription;
import com.his.service.IPrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("prescription")
public class PrescriptionController {

    @Autowired
    IPrescriptionService prescriptionService;

    @RequestMapping(value = "addprescription",method = RequestMethod.POST)
    public void addinfo(Prescription prescription){
        prescriptionService.addprescription(prescription);
    }

}
