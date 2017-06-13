package com.qczl.controller;

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

import com.qczl.model.News;
import com.qczl.service.INewsService;

@Controller
public class NewsController {
	
	private INewsService newsService;
	
	public INewsService getNewsService() {
		return newsService;
	}
	@Autowired
	public void setNewsService(INewsService newsService) {
		this.newsService = newsService;
	}
	
	@RequestMapping(value="/admin/newslist_admin")
	public String newsList(Model model){
		List<News> newsList = newsService.findAllNews();
		model.addAttribute("newsList", newsList);
		return "news_list";
	}
	
	@RequestMapping(value="/news_list")
	public String news_List(Model model){
		List<News> newsList = newsService.findAllNews();
		model.addAttribute("newsList", newsList);
		return "forward:news_list.jsp";
	}
	
	@RequestMapping(value="/news_ajax")
	public String news_Ajax(Model model){
		List<News> newsList = newsService.findAllNews();
		model.addAttribute("newsList", newsList);
		return "forward:news_ajax.jsp";
	}
	
	@RequestMapping(value="/admin/newsadd_admin",method=RequestMethod.GET)
	public String addNews(Model model){
		News news = new News();
		model.addAttribute("news", news);
		return "news_add";
	}
	@RequestMapping(value="/admin/newsadd_admin",method=RequestMethod.POST)
	public String addNews(@Valid News news ,BindingResult bs ,Model model){
		if(news!=null){
			newsService.addNews(news);
		}
		model.addAttribute("news", news);
		return "redirect:/admin/newslist_admin";
	}
	
	@RequestMapping(value="/admin/newsdelete_admin/{id}",method=RequestMethod.GET)
	public String deleteNews(@PathVariable Integer id){
		if(newsService.deleteById(id)){
			 return "redirect:/admin/newslist_admin";
		 }
		return "error";
	}
	@RequestMapping(value="/admin/newsupdate_admin/{id}",method=RequestMethod.GET)
	public String updateNews(@PathVariable Integer id,Model model){
		News news = newsService.findById(id);
		model.addAttribute("news", news);
		return "news_update";
	}
	@RequestMapping(value="/admin/newsupdate_admin/{id}",method=RequestMethod.POST)
	public String updateNews(@Validated News news ,BindingResult br){
		if(br.hasErrors())
			return "news_update";
		newsService.updateNews(news);
		return "redirect:/admin/newslist_admin";
	}
	@RequestMapping(value="/news_info/{id}",method=RequestMethod.GET)
	public String news_Info(@PathVariable Integer id,Model model,HttpSession session){
		News news = newsService.findById(id);
		session.setAttribute("news", news);
		return "redirect:../news_info.jsp";
	}
}
