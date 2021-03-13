package com.his.mapper;

import com.his.entity.Drugstemplate;

import java.util.List;

public interface DrugstemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Drugstemplate record);

    int insertSelective(Drugstemplate record);

    Drugstemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Drugstemplate record);

    int updateByPrimaryKey(Drugstemplate record);

    List<Drugstemplate> select();
}