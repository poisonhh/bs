package com.qczl.service;

import java.util.List;

import com.qczl.model.Members;

public interface IMembersService {

	List<Members> queryAllMembers();

	Members getMemberById(Integer id);

	void updateMember(Members member);

	void deleteMemberById(Integer id);

	boolean login(Members member);

	void addMember(Members member);

}
