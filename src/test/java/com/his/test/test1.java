package com.his.test;

import com.his.entity.Medicalrecord;
import com.his.entity.Register;

import com.his.service.impl.RegisterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-context*.xml")
public class test1 {

    @Autowired
    RegisterService registerService;

    @Test
    public void add(){
        Register register = new Register();
        register.setCasenumber(String.valueOf(600980));
        register.setRealname("郭同学");
        register.setGender(71);
        register.setIdnumber("140159195603194830");
        register.setBirthdate("1856-03-19");
        register.setAge(64);
        register.setHomeaddress("山西省太原市");
        register.setVisitdate("2020-07-18");
        register.setNoon("上午");
        register.setDeptid(1);
        register.setUserid(1);
        register.setRegistleid(2);
        register.setSettleid(1);
        register.setIsbook("1");
        register.setRegisterid(301);
        register.setVisitstate(1);

        registerService.submit(register);
    }

    @Test
    public void selectbycasenumber1(){
        List<Register> list = registerService.getinfolist("600600");
        System.out.println(list.get(0).toString());
    }

    @Test
    public void selectbycasenumber2(){
        Register register = registerService.getinfo("600600");
        System.out.println(register.toString());
    }

}
