package com.his.service.impl;

import com.his.entity.Register;
import com.his.mapper.RegisterMapper;
import com.his.service.IRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService implements IRegisterService {

    @Autowired
    private RegisterMapper registerMapper;

    @Override
    public List<Register> getlist() {
        return registerMapper.select();
    }

    @Override
    public void submit(Register register) {
        registerMapper.insert(register);
    }

    @Override
    public List<Register> getinfolist(String casenumber) {
        return registerMapper.selectByCasenumber1(casenumber);
    }

    @Override
    public Register getinfo(String casenumber) {
        return registerMapper.selectByCasenumber2(casenumber);
    }


}
