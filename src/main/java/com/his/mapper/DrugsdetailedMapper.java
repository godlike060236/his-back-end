package com.his.mapper;

import com.his.entity.Drugsdetailed;

import java.util.List;

public interface DrugsdetailedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Drugsdetailed record);

    int insertSelective(Drugsdetailed record);

    List<Drugsdetailed> selectByDrugsTempID(Integer drugstempid);

    int updateByPrimaryKeySelective(Drugsdetailed record);

    int updateByPrimaryKey(Drugsdetailed record);
}