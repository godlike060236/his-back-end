package com.his.test;

import com.his.entity.Drugstemplate;
import com.his.service.impl.DrugstemplateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-context*.xml")

public class test3 {

    @Autowired
    DrugstemplateService drugstemplateService;

    @Test
    public void getList(){
        List<Drugstemplate> list = drugstemplateService.getdrugstemplate();
        System.out.println(list.get(0).toString());
    }
}
