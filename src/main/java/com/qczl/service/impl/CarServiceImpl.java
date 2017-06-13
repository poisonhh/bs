package com.qczl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qczl.dao.CarMapper;
import com.qczl.model.Car;
import com.qczl.service.ICarService;
@Service("carService")
public class CarServiceImpl implements ICarService {

	private CarMapper carMapper;

	public CarMapper getCarMapper() {
		return carMapper;
	}
	@Autowired
	public void setCarMapper(CarMapper carMapper) {
		this.carMapper = carMapper;
	}
	public boolean addCar(Car car) {
		// TODO Auto-generated method stub
		if(carMapper.insertSelective(car)>0){
			return true;
		}
		return false;
		}
	public List<Car> queryAllCar() {
		// TODO Auto-generated method stub
		return carMapper.queryAllCar();
	}
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		carMapper.deleteByPrimaryKey(id);
	}
	public Car findById(Integer id) {
		// TODO Auto-generated method stub
		return carMapper.selectByPrimaryKey(id);
	}
	public void updateCarById(Car car) {
		// TODO Auto-generated method stub
		carMapper.updateByPrimaryKeySelective(car);
	}
	
	
}
