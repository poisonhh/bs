package com.qczl.service;

import java.util.List;

import com.qczl.model.Goods;

public interface IGoodsSercice {

	List<Goods> queryAllGoods();

	boolean deleteGoods(Integer gid);

	Goods findById(Integer id);

	boolean addGoods(Goods goods);

	void updateById(Goods goods);
	

}
