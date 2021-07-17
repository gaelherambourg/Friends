package com.springboot_project.gael.services;

import java.util.List;

import com.springboot_project.gael.bo.Car;

public interface CarService {

	List<Car> getCars();
	void addCar(Car car);
	void updateCar(Car car);
	void deleteCar(Long id);
	
}
