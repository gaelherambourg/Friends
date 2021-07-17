package com.springboot_project.gael.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_project.gael.bo.Car;
import com.springboot_project.gael.services.CarService;

@RestController
@CrossOrigin
public class CarController {

	private CarService carService;
	
	public CarController(CarService carService) {
		this.carService = carService;
	}
	
	@GetMapping("/cars")
	public List<Car> getCars(){
		return carService.getCars();
	}
	
	@PostMapping("/cars/addnew")
	public void addCar(@RequestBody Car car) {
		carService.addCar(car);
	}
	
	@PutMapping("/cars/{id}/edit")
	public void updateCar(@PathVariable("id") Long id, @RequestBody Car car) {
		carService.updateCar(car);
	}
	
	@DeleteMapping("/cars/{id}/delete")
	public void deleteCar(@PathVariable("id") Long id) {
		carService.deleteCar(id);
	}
}
