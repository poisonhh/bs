package com.qczl.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qczl.model.About;
import com.qczl.service.IAboutService;

@Controller
public class AboutController {

		private IAboutService aboutService;

		public IAboutService getAboutService() {
			return aboutService;
		}
		@Autowired
		public void setAboutService(IAboutService aboutService) {
			this.aboutService = aboutService;
		}
		
		@RequestMapping(value="/admin/abouttoupdate_admin/{id}",method=RequestMethod.GET)
		public String aboutUpdate(@PathVariable Integer id,Model model){
			About about = aboutService.getById(id);
			model.addAttribute("about", about);
			return "about_update";
		}
		@RequestMapping(value="/admin/abouttoupdate_admin/{id}",method=RequestMethod.POST)
		public String aboutUpdate(@Validated About about,BindingResult br){
			aboutService.updateAbout(about);
			return "forward:../about_update.jsp";
		}
		
		@RequestMapping(value="/about_info/{id}",method=RequestMethod.GET)
		public String about_Info(@PathVariable Integer id,Model model,HttpSession session){
			About about = aboutService.getById(id);
			session.setAttribute("about", about);
			return "redirect:../about_info.jsp";
		}
}
