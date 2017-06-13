package com.qczl.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
	 /*@RequestMapping(value="/test",method=RequestMethod.GET)  
	    public String test(HttpServletRequest request,Model model){  
	        int userId = Integer.parseInt(request.getParameter("id"));  
	        System.out.println("userId:"+userId);
	        Admin user=null;
	        if (userId==1) {
	        	 user = new Admin();  
	        	 user.setPassword("123");
	        	 user.setUsername("ssss");
			}
	        model.addAttribute("user", user);  
	        return "index";  
	    }  */
	 
	 @RequestMapping(value="/adminlogin_admin",method=RequestMethod.POST)
	 public String adminlogin(Admin admin,Model model,HttpSession session){
		 if(adminService.login(admin)){
			 session.setAttribute("admin", admin);
			 return "admin_index";
		 }else{
			 model.addAttribute("admin", admin);
			 return "index";
		 }
	 }
	 
	 @RequestMapping(value="/adminadd_admin",method=RequestMethod.GET)
	 public String adminAdd(Model model){
		 Admin admin = new  Admin();
		 model.addAttribute("admin",admin);
		 return "admin_add";
	 }
	 @RequestMapping(value="/adminadd_admin",method=RequestMethod.POST)
	 public String adminAdd(@Valid Admin admin,BindingResult bs,Model model){
		 if(admin!=null){
			 adminService.addAdmin(admin);
		 }
		 model.addAttribute("admin", admin);
		 return "redirect:/admin/adminlist_admin";
	 }
	 
	 @RequestMapping(value="/adminlist_admin")
	 public String adminList(Model model){
		 List<Admin> adminList = adminService.queryAll();
		 model.addAttribute("adminList", adminList);
		 return "admin_list";
	 }
	 
	 @RequestMapping(value="/admindelete_admin/{id}",method=RequestMethod.GET)
	 public String adminDelete(@PathVariable Integer id){
		 if(adminService.deleteById(id)){
			 return "redirect:/admin/adminlist_admin";
		 }
		return "error";
	 }
	 @RequestMapping(value="/adminupdate_admin/{id}",method=RequestMethod.GET)
	 public String adminUpdate(@PathVariable Integer id,Model model){
		 Admin admin = adminService.findById(id);
		 model.addAttribute("admin", admin);
		 return "admin_update";
	 }
	 @RequestMapping(value="/adminupdate_admin/{id}",method=RequestMethod.POST)
	 public String adminUpdate(@Validated Admin admin,BindingResult br){
		 if(br.hasErrors())
			 return "admin_update";
		 adminService.updateAdminById(admin);
		 return "redirect:/admin/adminlist_admin";
	 }
}
