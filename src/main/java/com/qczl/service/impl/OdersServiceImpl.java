package com.qczl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qczl.dao.OdersMapper;
import com.qczl.model.Oders;
import com.qczl.service.IOdersService;

@Service("odersService")
public class OdersServiceImpl implements IOdersService {
	
	private OdersMapper odersMapper;

	public OdersMapper getOdersMapper() {
		return odersMapper;
	}
	@Autowired
	public void setOdersMapper(OdersMapper odersMapper) {
		this.odersMapper = odersMapper;
	}
	public List<Oders> findAllByUsername() {
		// TODO Auto-generated method stub
		return odersMapper.findAllOdersByUsername();
	}
	public List<Oders> findAll() {
		// TODO Auto-generated method stub
		return odersMapper.findAll();
	}
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		odersMapper.deleteByPrimaryKey(id);
	}
	public void updateFlagById(Integer id) {
		// TODO Auto-generated method stub
		odersMapper.updateFlagById(id);
	}
	public void updateqFlagById(Integer id) {
		// TODO Auto-generated method stub
		odersMapper.updateqFlagById(id);
	}
	public void addOders(Oders oders) {
		// TODO Auto-generated method stub
		odersMapper.insertSelective(oders);
	}
	
	
}
