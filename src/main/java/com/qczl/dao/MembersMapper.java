package com.qczl.dao;

import java.util.List;

import com.qczl.model.Members;

public interface MembersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Members record);

    int insertSelective(Members record);

    Members selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Members record);

    int updateByPrimaryKey(Members record);

	List<Members> queryAllMembers();
}