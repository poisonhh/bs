package com.qczl.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qczl.model.Admin;
import com.qczl.service.IAdminService;
@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Resource
	private IAdminService adminService;
	public void setAdminService(IAdminService adminService) {
		this.adminService = adminService;
	}
	 @RequestMapping(value="/test",method=RequestMethod.GET)  
	    public String test(HttpServletRequest request,Model model){  
	        int userId = Integer.parseInt(request.getParameter("id"));  
	        System.out.println("userId:"+userId);
	        Admin user=null;
	        if (userId==1) {
	        	 user = new Admin();  
	        	 user.setPassword("123");
	        	 user.setUsername("ssss");
			}
	       
	      //  log.debug(user.toString());
	        model.addAttribute("user", user);  
	        return "index";  
	    }  
	 
	 @RequestMapping(value="/adminlogin_admin",method=RequestMethod.POST)
	 public String adminlogin(Admin admin,Model model){
		 System.out.println(admin+"============");
		 if(adminService.login(admin)){
			 return "admin_index";
		 }else{
			 model.addAttribute("admin", admin);
			 return "index";
		 }
	 }
	 @RequestMapping(value="/admintoadd_admin")
	 public String adminadd(Admin admin){
		 if(adminService.addAdmin(admin)){
			 return "admin_add";
		 }else{
			 return "error";
		 }
	 }
	 @RequestMapping("/adminlist_admin")
	 public String adminList(Model model){
		 List<Admin> adminList = adminService.queryAll();
		 model.addAttribute("adminList", adminList);
		 return "admin_list";
	 }
	 @RequestMapping(value="/admindelete_admin/{id}")
	 public String adminDelete(@PathVariable Integer id){
		 if(adminService.deleteById(id)){
			 return "admin_list";
		 }
		 return "";
	 }
	 @RequestMapping(value="/adminupdate_admin/{admin}")
	 public String adminUpdate(@PathVariable Admin admin){
		 if(adminService.updateAdminById(admin)){
			 return "admin_update";
		 }
		 return "";
	 }
}
