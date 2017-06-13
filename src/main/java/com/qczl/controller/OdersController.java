package com.qczl.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qczl.model.Admin;
import com.qczl.model.Members;
import com.qczl.model.Oders;
import com.qczl.service.IOdersService;

@Controller
public class OdersController {

	private IOdersService odersService;

	public IOdersService getOdersService() {
		return odersService;
	}
	@Autowired
	public void setOdersService(IOdersService odersService) {
		this.odersService = odersService;
	}
	
	@RequestMapping(value="/oders_list")
	public String odersList(Model model){
		List<Oders> odersList = odersService.findAllByUsername();
		model.addAttribute("odersList", odersList);
		return "forward:oders_list.jsp";
	}
	@RequestMapping(value="/admin/oderslist_admin")
	public String odersList1(Model model){
		List<Oders> odersList = odersService.findAll();
		model.addAttribute("odersList", odersList);
		return  "oders_list";
	}
	
	@RequestMapping(value="/odersupdate_qflag/{id}",method=RequestMethod.GET)
	public String qflagUpdate(@PathVariable Integer id){
		odersService.updateqFlagById(id);
		return "redirect:/oders_list";
	}
	@RequestMapping(value="/oderstoadd_admin/{gid}",method=RequestMethod.GET)
	public String addOders(@PathVariable Integer gid,Model model,HttpSession session){
		Oders oders = new Oders();
		model.addAttribute("oders", oders);
		return "redirect:../oders_add.jsp";
	}
	
	@RequestMapping(value="/odersadd_admin",method=RequestMethod.POST)
	public String addOders(@Valid Oders oders,BindingResult br,Model model,HttpSession session){
		Members members = (Members)session.getAttribute("member");
		Date date = new  Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddHHmmss");
		oders.setGid(1);
		oders.setOrderid(sdf1.format(date));
		oders.setAddtime(sdf.format(date));
		oders.setBuynum(1);
		oders.setUsername(members.getUsername());
		odersService.addOders(oders);
		model.addAttribute("oders", oders);
		return "redirect:oders_list";
	}
	
	@RequestMapping(value="/admin/odersdelete_admin/{id}",method=RequestMethod.GET)
	public String odersDelete(@PathVariable Integer id){
		odersService.deleteById(id);
		return "redirect:/admin/oderslist_admin";
	}
	@RequestMapping(value="/admin/odersupdate_flag/{id}",method=RequestMethod.GET)
	public String updateFlag(@PathVariable Integer id){
		odersService.updateFlagById(id);
		return "redirect:/admin/oderslist_admin";
	}
	
}
