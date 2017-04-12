package com.qczl.dao;

import java.util.List;

import com.qczl.model.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
    
    Admin checkName(Admin admin);

	Admin loginCheck(Admin admin);

	List<Admin> queryAll();
}