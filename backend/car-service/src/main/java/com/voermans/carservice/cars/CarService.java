package com.voermans.carservice.cars;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).orElseThrow();
    }

    public Car getCarByLicense(String license) {
        return carRepository.findByLicense(license).orElseThrow();
    }

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        carRepository.findAll().forEach(cars::add);

        return cars;
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(Car car) {
        carRepository.findByLicense(car.getLicense())
                .ifPresent(oldCar -> {
                    if (oldCar.equals(car)) {
                        return;
                    }

                    carRepository.save(car);
                });

        return car;
    }
}
