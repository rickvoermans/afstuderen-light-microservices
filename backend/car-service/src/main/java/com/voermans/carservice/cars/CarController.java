package com.voermans.carservice.cars;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "cars")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/{license}")
    public Car getCarByLicense(@PathVariable String license) {
        return carService.getCarByLicense(license);
    }

    @PostMapping
    public Car saveNewCar(@RequestBody Car newCar) {
        return carService.saveCar(newCar);
    }

    @PutMapping
    public Car updateCar(@RequestBody Car updatedCar) {
        return carService.updateCar(updatedCar);
    }
}
