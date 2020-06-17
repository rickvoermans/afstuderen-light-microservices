package com.voermans.apkservice.apk;

import com.voermans.apkservice.rabbitmq.ApkMessage;
import com.voermans.apkservice.rabbitmq.RabbitMqSender;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApkService {

    private ApkRepository apkRepository;
    private RabbitMqSender rabbitMqSender;

    @Autowired
    public ApkService(ApkRepository apkRepository, RabbitMqSender rabbitMqSender) {
        this.apkRepository = apkRepository;
        this.rabbitMqSender = rabbitMqSender;
    }

    public ApkCar getApkCarById(Long id) {
        return apkRepository.findById(id).orElseThrow();
    }

    public ApkCar getApkCarByLicense(String license) {
        return apkRepository.findByLicense(license).orElseThrow();
    }

    public List<ApkCar> getAllApkCars() {
        List<ApkCar> apkCars = new ArrayList<>();
        apkRepository.findAll().forEach(apkCars::add);

        return apkCars;
    }

    public ApkCar saveApkCar(ApkCar apkCar) {
        rabbitMqSender.sendMessageToCarService(ApkMessage.from(apkCar));

        return apkRepository.save(apkCar);
    }
}
