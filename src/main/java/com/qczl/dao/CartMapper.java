package com.qczl.dao;

import java.util.List;

import com.qczl.model.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

	List<Cart> findAllByUsername();
}