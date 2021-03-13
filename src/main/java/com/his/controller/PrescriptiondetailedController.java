package com.his.controller;

import com.his.entity.Prescriptiondetailed;
import com.his.service.IPrescriptiondetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("prescriptiondetailed")
public class PrescriptiondetailedController {

    @Autowired
    IPrescriptiondetailedService prescriptiondetailedService;

    @RequestMapping(value = "adddetail",method = RequestMethod.POST)
    public void adddetail(Prescriptiondetailed prescriptiondetailed){
        prescriptiondetailedService.adddetail(prescriptiondetailed);
    }
}
