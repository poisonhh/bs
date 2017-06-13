package com.qczl.service;

import java.util.List;

import com.qczl.model.Admin;

public interface IAdminService {

	public boolean addAdmin(Admin admin);
	
	public boolean checkName(Admin admin);

	public boolean login(Admin admin);

	public List<Admin> queryAll();

	public boolean deleteById(Integer id);

	public Admin updateAdminById(Admin admin);

	public Admin findById(Integer id);
	
}
