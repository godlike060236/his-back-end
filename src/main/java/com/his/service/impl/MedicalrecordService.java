package com.his.service.impl;

import com.his.entity.Medicalrecord;
import com.his.mapper.MedicalrecordMapper;
import com.his.service.IMedicalreocrdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalrecordService implements IMedicalreocrdService {

    @Autowired
    private MedicalrecordMapper medicalrecordMapper;

    @Override
    public void addmedicalrecord(Medicalrecord medicalrecord) {
        medicalrecordMapper.insert(medicalrecord);
    }
}
