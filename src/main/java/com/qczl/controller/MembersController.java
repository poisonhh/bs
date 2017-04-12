package com.qczl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qczl.model.Members;
import com.qczl.service.IMembersService;
@Controller
public class MembersController {

	private IMembersService membersService;
	
	public IMembersService getMembersService() {
		return membersService;
	}
	@Autowired
	public void setMembersService(IMembersService membersService) {
		this.membersService = membersService;
	}

	@RequestMapping("/admin/memberslist_admin")
	 public String memberList(Model model){
		 List<Members> memberList = membersService.queryAllMembers();
		 model.addAttribute("memberList", memberList);
		 return "members_list";
	 }
}
