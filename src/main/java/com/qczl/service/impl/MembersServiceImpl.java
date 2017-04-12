package com.qczl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qczl.dao.MembersMapper;
import com.qczl.model.Members;
import com.qczl.service.IMembersService;
@Service("membersService")
public class MembersServiceImpl implements IMembersService {
	
	private MembersMapper membersMapper;
	public MembersMapper getMembersMapper() {
		return membersMapper;
	}
	@Autowired
	public void setMembersMapper(MembersMapper membersMapper) {
		this.membersMapper = membersMapper;
	}


	public List<Members> queryAllMembers() {
		// TODO Auto-generated method stub
		List<Members> membersList = membersMapper.queryAllMembers();
		return membersList;
	}

}
