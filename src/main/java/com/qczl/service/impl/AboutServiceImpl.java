package com.qczl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qczl.dao.AboutMapper;
import com.qczl.model.About;
import com.qczl.service.IAboutService;
@Service("aboutService")
public class AboutServiceImpl implements IAboutService {

	private AboutMapper adminMapper;
	
	public AboutMapper getAdminMapper() {
		return adminMapper;
	}
	@Autowired
	public void setAdminMapper(AboutMapper adminMapper) {
		this.adminMapper = adminMapper;
	}

	public About getById(Integer id) {
		// TODO Auto-generated method stub
		return adminMapper.selectByPrimaryKey(id);
	}
	public About updateAbout(About about) {
		// TODO Auto-generated method stub
		adminMapper.updateByPrimaryKey(about);
		return null;
	}

}
