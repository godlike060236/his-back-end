package com.his.test;

import com.his.entity.Prescription;
import com.his.service.impl.PrescriptionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-context*.xml")

public class test5 {

    @Autowired
    PrescriptionService prescriptionService;

    @Test
    public void add(){
        Prescription prescription = new Prescription();
        prescription.setMedicalid(123);
        prescription.setRegistid(123);
        prescription.setPrescriptionname("123");
        prescriptionService.addprescription(prescription);
    }
}
