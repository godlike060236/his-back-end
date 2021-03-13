package com.his.mapper;

import com.his.entity.Register;

import java.util.List;

public interface RegisterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Register record);

    int insertSelective(Register record);

    List<Register> selectByCasenumber1(String casenumber);

    Register selectByCasenumber2(String casenumber);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);

    List<Register> select();
}