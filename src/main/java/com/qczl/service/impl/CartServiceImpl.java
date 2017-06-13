package com.qczl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qczl.dao.CartMapper;
import com.qczl.model.Cart;
import com.qczl.service.ICartService;

@Service("cartService")
public class CartServiceImpl implements ICartService {

	private CartMapper cartMapper;

	public CartMapper getCartMapper() {
		return cartMapper;
	}
	@Autowired
	public void setCartMapper(CartMapper cartMapper) {
		this.cartMapper = cartMapper;
	}
	public void add(Cart cart) {
		// TODO Auto-generated method stub
		cartMapper.insertSelective(cart);
	}
	public List<Cart> findAllByUsername() {
		// TODO Auto-generated method stub
		return cartMapper.findAllByUsername();
	}
	public boolean deleteCartById(Integer cid) {
		// TODO Auto-generated method stub
		if(cartMapper.deleteByPrimaryKey(cid)>0){
			return true;
		}
		else
			return false;
	}
	
	
}
