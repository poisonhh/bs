package com.qczl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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

		@RequestMapping(value="/goodslist_admin")
		public String goodsList(Model model){
			List<Goods> goodsList = goodsService.queryAllGoods();
			model.addAttribute("goodsList", goodsList);
			return "goods_list";
		}
		
		@RequestMapping(value="/goodsdelete_admin/{gid}")
		public String goodsDelete(@PathVariable Integer gid){
			if(goodsService.deleteGoods(gid)){
				return "goodsdelete_admin";
			}
			return "goodsdelete_admin";
		}
		@RequestMapping(value="/goodstoupdate_admin")
		public String goodsUpdate(){
			return "";
		}
}
