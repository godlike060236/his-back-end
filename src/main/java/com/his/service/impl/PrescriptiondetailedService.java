package com.his.service.impl;

import com.his.entity.Prescriptiondetailed;
import com.his.mapper.PrescriptiondetailedMapper;
import com.his.service.IPrescriptiondetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptiondetailedService implements IPrescriptiondetailedService {

    @Autowired
    PrescriptiondetailedMapper prescriptiondetailedMapper;

    @Override
    public void adddetail(Prescriptiondetailed prescriptiondetailed) {
        prescriptiondetailedMapper.insert(prescriptiondetailed);
    }
}
