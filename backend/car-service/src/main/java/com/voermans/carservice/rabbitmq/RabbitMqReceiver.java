package com.voermans.carservice.rabbitmq;

import com.voermans.carservice.cars.Car;
import com.voermans.carservice.cars.CarService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqReceiver {

    private final CarService carService;

    @Autowired
    public RabbitMqReceiver(CarService carService) {
        this.carService = carService;
    }

    @RabbitListener(queues = "apk-queue")
    public void receive(ApkMessage apkMessage) throws InterruptedException {
        Car car = carService.getCarByLicense(apkMessage.getLicense());

        if (car != null) {
            car.setLastApk(apkMessage.getApkDate());
            car.increaseInspections();
            carService.updateCar(car);
        }
    }
}
