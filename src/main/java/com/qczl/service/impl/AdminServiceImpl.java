package com.qczl.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qczl.dao.AdminMapper;
import com.qczl.model.Admin;
import com.qczl.service.IAdminService;

@Service("adminService")
public class AdminServiceImpl implements IAdminService {
	
	
	private AdminMapper adminMapper;
	public AdminMapper getAdminMapper() {
		return adminMapper;
	}
	@Autowired
	public void setAdminMapper(AdminMapper adminMapper) {
		this.adminMapper = adminMapper;
	}

	public boolean addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		if((adminMapper.insertSelective(admin))>0){
			return true;
		}
		return false;
	}

	public boolean checkName(Admin admin) {
		// TODO Auto-generated method stub
		if(adminMapper.checkName(admin)!=null){
			return true;
		}
		return false;
	}
	public boolean login(Admin admin) {
		// TODO Auto-generated method stub
		if((adminMapper.loginCheck(admin))!=null){
			return true;
		}
		return false;
	}
	public List<Admin> queryAll() {
		// TODO Auto-generated method stub
		return adminMapper.queryAll();
	}
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		if((adminMapper.deleteByPrimaryKey(id))>0){
			return true;
		}
		return false;
	}
	public boolean updateAdminById(Admin admin) {
		// TODO Auto-generated method stub
		if((adminMapper.updateByPrimaryKey(admin))>0){
			
		}
		return false;
	}

}
