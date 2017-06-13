package com.qczl.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
import com.qczl.model.Car;
import com.qczl.service.ICarService;
import com.qczl.service.ICartService;
import com.qczl.service.impl.CarServiceImpl;

@Controller
public class CarController {
	
	private ICarService carService;
	
	public ICarService getCarService() {
		return carService;
	}
	@Autowired
	public void setCarService(ICarService carService) {
		this.carService = carService;
	}

	@RequestMapping(value="/admin/caradd_admin",method=RequestMethod.GET)
	public String carAdd(Model model){
		Car car = new Car();
		model.addAttribute("car", car);
		return "car_add";
	}
	@RequestMapping(value="/admin/caradd_admin",method=RequestMethod.POST)
	public String carAdd(@Valid Car car,BindingResult bs,Model model){
		if(car!=null){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(new Date());
			car.setBuytime(date);
			carService.addCar(car);
		}
		model.addAttribute("car", car);
		return "redirect:/admin/carlist_admin";
	}
	
	@RequestMapping(value="/admin/carlist_admin")
	public String carList(Model model){
		List<Car> carList = carService.queryAllCar();
		model.addAttribute("carList", carList);
		return "car_list";
	}
	
	@RequestMapping(value="/admin/cardelete_admin/{id}",method=RequestMethod.GET)
	public String carDelete(@PathVariable Integer id){
		carService.deleteById(id);
		return "redirect:/admin/carlist_admin";
	}
	@RequestMapping(value="/admin/carupdate_admin/{id}",method=RequestMethod.GET)
	public String carUpdate(@PathVariable Integer id,Model model){
		Car car = carService.findById(id);
		model.addAttribute("car", car);
		return "car_update";
	}
	@RequestMapping(value="/admin/carupdate_admin/{id}",method=RequestMethod.POST)
	public String carUpdate(@Validated Car car,BindingResult br){
		if(br.hasErrors())
		return  "car_update";
		carService.updateCarById(car);
		return "redirect:/admin/carlist_admin";
	}
}
