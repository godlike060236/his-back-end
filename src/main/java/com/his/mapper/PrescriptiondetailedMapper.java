package com.his.mapper;

import com.his.entity.Prescriptiondetailed;

public interface PrescriptiondetailedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Prescriptiondetailed record);

    int insertSelective(Prescriptiondetailed record);

    Prescriptiondetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Prescriptiondetailed record);

    int updateByPrimaryKey(Prescriptiondetailed record);
}