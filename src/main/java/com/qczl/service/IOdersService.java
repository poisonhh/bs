package com.qczl.service;

import java.util.List;

import com.qczl.model.Oders;

public interface IOdersService {

	List<Oders> findAllByUsername();

	List<Oders> findAll();

	void deleteById(Integer id);

	void updateFlagById(Integer id);

	void updateqFlagById(Integer id);

	void addOders(Oders oders);

}
