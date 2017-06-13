package com.qczl.service;

import java.util.List;

import com.qczl.model.Cart;

public interface ICartService {

	void add(Cart cart);

	List<Cart> findAllByUsername();

	boolean deleteCartById(Integer cid);

}
