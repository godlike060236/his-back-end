package com.his.test;

import com.his.service.impl.DrugsdetailedService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-context*.xml")

public class test4 {

    @Autowired
    DrugsdetailedService drugsdetailedService;

    @Test
    public void get(){
        drugsdetailedService.getdetail(2);
    }
}
