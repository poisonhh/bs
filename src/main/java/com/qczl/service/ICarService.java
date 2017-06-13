package com.qczl.service;

import java.util.List;

import com.qczl.model.Car;

public interface ICarService {

	boolean addCar(Car car);

	List<Car> queryAllCar();

	void deleteById(Integer id);

	Car findById(Integer id);

	void updateCarById(Car car);
	
	
}
