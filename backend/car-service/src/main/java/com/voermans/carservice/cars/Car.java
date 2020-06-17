package com.voermans.carservice.cars;

import java.time.LocalDate;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "CARS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CAR_ID")
    private Long id;

    @Column(name = "CAR_LICENSE")
    private String license;

    @Column(name = "CAR_BRAND")
    private String brand;

    @Column(name = "CAR_TYPE")
    private String type;

    @Column(name = "CAR_OWNER")
    private String owner;

    @Column(name = "AMOUNT_APK_INSPECTIONS")
    private int apkInspections;

    @Column(name = "LAST_APK_INSPECTION")
    private LocalDate lastApk;

    public Car(String license, String brand, String type, String owner) {
        this.license = license;
        this.brand = brand;
        this.type = type;
        this.owner = owner;
    }

    public void increaseInspections() {
        apkInspections++;
    }
}
