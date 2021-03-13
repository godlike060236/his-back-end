package com.his.service.impl;

import com.his.entity.Drugsdetailed;
import com.his.mapper.DrugsdetailedMapper;
import com.his.service.IDrugsdetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugsdetailedService implements IDrugsdetailedService {

    @Autowired
    DrugsdetailedMapper drugsdetailedMapper;


    @Override
    public List<Drugsdetailed> getdetail(int drugstempid) {
        return drugsdetailedMapper.selectByDrugsTempID(drugstempid);
    }
}
