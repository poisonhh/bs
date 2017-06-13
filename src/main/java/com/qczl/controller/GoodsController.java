package com.qczl.controller;

import java.io.File;
import java.io.IOException;
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
import org.springframework.web.multipart.MultipartFile;

import com.qczl.model.Goods;
import com.qczl.service.IGoodsSercice;

@Controller
public class GoodsController {
		
		private IGoodsSercice goodsService;
		
		public IGoodsSercice getGoodsService() {
			return goodsService;
		}
		@Autowired
		public void setGoodsService(IGoodsSercice goodsService) {
			this.goodsService = goodsService;
		}

		@RequestMapping(value="/admin/goodslist_admin")
		public String goodsList(Model model){
			List<Goods> goodsList = goodsService.queryAllGoods();
			model.addAttribute("goodsList", goodsList);
			return "goods_list";
		}
		
		@RequestMapping(value="/goods_list")
		public String goods_List(Model model){
			List<Goods> goodsList = goodsService.queryAllGoods();
			model.addAttribute("goodsList", goodsList);
			return "forward:goods_list.jsp";
		}
		
		@RequestMapping(value="/goods_ajax",method=RequestMethod.GET)
		public String goods_Ajax(Model model){
			List<Goods> goodsList = goodsService.queryAllGoods();
			model.addAttribute("goodsList", goodsList);
			return "forward:goods_ajax.jsp";
		}
		@RequestMapping(value="/goodsdelete_admin/{gid}")
		public String goodsDelete(@PathVariable Integer gid){
			if(goodsService.deleteGoods(gid)){
				return "goodsdelete_admin";
			}
			return "goodsdelete_admin";
		}
		
		
		@RequestMapping(value="/goods_info/{id}",method=RequestMethod.GET)
		public String goods_Info(@PathVariable Integer id,HttpSession session){
			Goods goods = goodsService.findById(id);
			session.setAttribute("goods", goods);
			return "redirect:../goods_info.jsp";
		}
		
		@RequestMapping(value="/admin/goodsadd_admin",method=RequestMethod.GET)
		public String goodsAdd(Model model){
			Goods goods = new Goods();
			model.addAttribute("goods", goods);
			return "goods_add";
		}
		@RequestMapping(value="/admin/goodsadd_admin",method=RequestMethod.POST)
		public String goodsAdd(@Valid Goods goods ,BindingResult br,Model model,MultipartFile file){
			if(goods!=null){
				String fileName = file.getOriginalFilename();
				String filePath = "D:/upload/imgs/"; 
				goods.setPicurl(filePath+fileName);
				File file1=new File(filePath+fileName);
                //上传
                try {
					file.transferTo(file1);
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				goodsService.addGoods(goods);
			}
			model.addAttribute("goods", goods);
			return "redirect:/admin/goodslist_admin";
		}
		@RequestMapping(value="/admin/goodsdelete_admin/{gid}",method=RequestMethod.GET)
		public String goodsDelete1(@PathVariable Integer gid){
			if(goodsService.deleteGoods(gid))
				return "redirect:/admin/goodslist_admin";
			return "error";
		}
		
		@RequestMapping(value="/admin/goodstoupdate_admin/{gid}",method=RequestMethod.GET)
		public String goodsUpdate(@PathVariable Integer gid,Model model){
			Goods goods = goodsService.findById(gid);
			model.addAttribute("goods", goods);
			return "goods_update";
		}
		@RequestMapping(value="/admin/goodstoupdate_admin/{gid}",method=RequestMethod.POST)
		public String goodsUpdate(@Validated Goods goods,BindingResult br,Model model){
			if(br.hasErrors())
				return  "goods_update";
				goodsService.updateById(goods);
				return "redirect:/admin/goodslist_admin";
			
		}
}
