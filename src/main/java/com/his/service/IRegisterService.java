package com.his.service;

import com.his.entity.Register;

import java.util.List;

public interface IRegisterService {

    List<Register> getlist();

    void submit(Register register);

    List<Register> getinfolist(String casenumber);

    Register getinfo(String casenumber);
}
