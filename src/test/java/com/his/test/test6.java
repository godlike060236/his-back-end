package com.his.test;

import com.his.entity.Prescriptiondetailed;
import com.his.service.impl.PrescriptiondetailedService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-context*.xml")

public class test6 {

    @Autowired
    PrescriptiondetailedService prescriptiondetailedService;

    @Test
    public void add(){
        Prescriptiondetailed prescriptiondetailed = new Prescriptiondetailed();
        prescriptiondetailed.setState(6);
        prescriptiondetailedService.adddetail(prescriptiondetailed);
    }
}
