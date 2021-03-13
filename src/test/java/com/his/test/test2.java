package com.his.test;

import com.his.entity.Medicalrecord;
import com.his.service.impl.MedicalrecordService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-context*.xml")

public class test2 {

    @Autowired
    MedicalrecordService medicalrecordService;

    @Test
    public void add2(){
        Medicalrecord medicalrecord = new Medicalrecord();
        medicalrecord.setCasenumber("600600");
        medicalrecord.setRegistid(2);
        System.out.println(medicalrecord.toString());
        medicalrecordService.addmedicalrecord(medicalrecord);
    }
}
