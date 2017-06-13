package com.qczl.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qczl.model.Cart;
import com.qczl.service.ICartService;

@Controller
public class CartController {

	private ICartService cartService;

	public ICartService getCartService() {
		return cartService;
	}
	@Autowired
	public void setCartService(ICartService cartService) {
		this.cartService = cartService;
	}
	
	@RequestMapping(value="/cartadd_admin/{gid}",method=RequestMethod.GET)
	public String cartadd(@PathVariable Integer gid,HttpSession session){
		String username = (String) session.getAttribute("username");
		//Goods goods = goodsService.findById(gid);
		Cart cart = new Cart();
		cart.setUsername(username);
		cart.setGid(gid);
		cart.setBuynum(1);
		cartService.add(cart);
		return "redirect:/cart_list";
	}
	@RequestMapping(value="/cart_list")
	public String cartList(Model model){
		List<Cart> cartList = cartService.findAllByUsername();
		model.addAttribute("cartList", cartList);
		return "forward:cart_list.jsp";
	}
	@RequestMapping(value="/cartdelete_admin/{cid}",method=RequestMethod.GET)
	public String cartDelete(@PathVariable Integer cid){
		cartService.deleteCartById(cid);
		return "redirect:/cart_list";
	}
	
}
