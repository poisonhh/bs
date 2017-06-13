package com.qczl.dao;

import java.util.List;

import com.qczl.model.Oders;

public interface OdersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Oders record);

    int insertSelective(Oders record);

    Oders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Oders record);

    int updateByPrimaryKey(Oders record);

	List<Oders> findAllOdersByUsername();

	List<Oders> findAll();

	int updateFlagById(Integer id);

	int updateqFlagById(Integer id);
}