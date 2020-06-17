package com.voermans.carservice;

import com.voermans.carservice.cars.Car;
import com.voermans.carservice.cars.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarServiceApplication implements CommandLineRunner {

    @Autowired
    private CarService carService;

    public static void main(String[] args) {
        SpringApplication.run(CarServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Initialize db with dummy data to test:
        carService.saveCar(new Car("12-XZG-1", "Opel", "Astra", "Karel de Groot"));
        carService.saveCar(new Car("20-VVG-0", "Honda", "2", "Karel de Groot"));
        carService.saveCar(new Car("1-SFL-99", "Volkswagen", "Polo", "Piet Klerx"));
        carService.saveCar(new Car("99-AZ-P2", "Ford", "Fiesta", "Kees de Koning"));
        carService.saveCar(new Car("32-VG-PP", "Toyota", "Yaris", "Rick Voermans"));
    }
}
