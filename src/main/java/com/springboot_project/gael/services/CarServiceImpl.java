package com.springboot_project.gael.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot_project.gael.bo.Car;
import com.springboot_project.gael.dal.CarRepository;

@Service
public class CarServiceImpl implements CarService{

	private CarRepository  carRepository;
	
	public CarServiceImpl(CarRepository carRepository) {
		this.carRepository = carRepository;
	}
	
	@Override
	public List<Car> getCars() {
		return carRepository.findAll();
	}

	@Override
	public void addCar(Car car) {
		carRepository.save(car);
	}

	@Override
	public void updateCar(Car car) {
		carRepository.save(car);
	}

	@Override
	public void deleteCar(Long id) {
		carRepository.deleteById(id);
	}

}
