package com.qczl.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysql.fabric.xmlrpc.base.Member;
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
	@RequestMapping(value="/admin/membersdelete_admin/{id}",method=RequestMethod.GET)
	public String memberDelete(@PathVariable Integer id,Model model){
		membersService.deleteMemberById(id);
		return "redirect:/admin/memberslist_admin";
	}
	
	@RequestMapping(value="/admin/memberupdate_admin/{id}",method=RequestMethod.GET)
	public String memberUpdate(@PathVariable Integer id,Model model){
		Members member = membersService.getMemberById(id);
		model.addAttribute("member", member);
		return "admin_update";
	}
	@RequestMapping(value="/admin/memberupdate_admin/{id}",method=RequestMethod.POST)
	public String memberUpdate(@PathVariable Integer id ,@Valid Members member,BindingResult br){
		membersService.updateMember(member);
        return "redirect:/admin/members_list";  
	}
	@RequestMapping(value="memberslogin_admin",method=RequestMethod.POST)
	public String memberLogin(Members member,Model model,HttpSession session){
		String msg = "用户名或者密码错误";
		if(membersService.login(member)){
			session.setAttribute("member", member);
			return "redirect:index.jsp";
		}
		else{
			model.addAttribute("msg", msg);
			return "redirect:index.jsp";
		}
	}
	@RequestMapping(value="/membersadd_admin",method=RequestMethod.POST)
	public String register(@Valid Members member,BindingResult br){
		if(member!=null){
			membersService.addMember(member);
		}
		return "redirect:index.jsp";
	}
}
