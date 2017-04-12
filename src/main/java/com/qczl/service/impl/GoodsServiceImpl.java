package com.qczl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qczl.dao.GoodsMapper;
import com.qczl.model.Goods;
import com.qczl.service.IGoodsSercice;
@Service("goodsService")
public class GoodsServiceImpl implements IGoodsSercice {
	
	private GoodsMapper goodsMapper;
	
	public GoodsMapper getGoodsMapper() {
		return goodsMapper;
	}
	@Autowired
	public void setGoodsMapper(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}

	public List<Goods> queryAllGoods() {
		// TODO Auto-generated method stub
		List<Goods> listGoods = goodsMapper.queryAllGoods();
		return listGoods;
	}
	public boolean deleteGoods(Integer gid) {
		// TODO Auto-generated method stub
		if(goodsMapper.deleteByPrimaryKey(gid)>0){
			return true;
		}
		return false;
	}

}
