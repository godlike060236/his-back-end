package com.his.service.impl;

import com.his.entity.Prescription;
import com.his.mapper.PrescriptionMapper;
import com.his.service.IPrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionService implements IPrescriptionService {

    @Autowired
    PrescriptionMapper prescriptionMapper;

    @Override
    public void addprescription(Prescription prescription) {
        prescriptionMapper.insert(prescription);
    }
}
