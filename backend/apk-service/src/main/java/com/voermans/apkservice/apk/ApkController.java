package com.voermans.apkservice.apk;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "apk")
public class ApkController {

    private ApkService apkService;

    @Autowired
    public ApkController(ApkService apkService) {
        this.apkService = apkService;
    }

    @GetMapping
    public List<ApkCar> getAllApkCars() {
        return apkService.getAllApkCars();
    }

    @GetMapping("/{license}")
    public ApkCar getApkCarByLicense(@PathVariable String license) {
        return apkService.getApkCarByLicense(license);
    }

    @PostMapping
    public ApkCar saveApkCar(@RequestBody ApkCar newApkCar) {
        return apkService.saveApkCar(newApkCar);
    }
}
