package com.his.service.impl;

import com.his.entity.Drugstemplate;
import com.his.mapper.DrugstemplateMapper;
import com.his.service.IDrugstemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugstemplateService implements IDrugstemplateService{

    @Autowired
    DrugstemplateMapper drugstemplateMapper;

    @Override
    public List<Drugstemplate> getdrugstemplate() {
        return drugstemplateMapper.select();
    }
}
