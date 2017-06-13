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
	public Members getMemberById(Integer id) {
		// TODO Auto-generated method stub
		return membersMapper.selectByPrimaryKey(id);
	}
	public void updateMember(Members member) {
		// TODO Auto-generated method stub
		membersMapper.insertSelective(member);
	}
	public void deleteMemberById(Integer id) {
		// TODO Auto-generated method stub
		membersMapper.deleteByPrimaryKey(id);
	}
	public boolean login(Members member) {
		// TODO Auto-generated method stub
		if(membersMapper.loginCheck(member)!=null){
			return true;
		}
		return false;
	}
	public void addMember(Members member) {
		// TODO Auto-generated method stub
		membersMapper.insertSelective(member);
	}

}
