package com.voermans.apkservice.apk;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;
import lombok.*;

/**
 * This domain class is used for cars which are inspected (MOT)
 * Information like which activities are done and which car it is
 *
 * Will communicate with CarService to update their information
 *
 * @author Rick Voermans
 */

@Entity
@Table(name = "APK_MAINTANANCE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class    ApkCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "APKCAR_ID")
    private Long id;

    @Column(name = "APKCAR_LICENSE")
    private String license;

    @Column(name = "APKCAR_DATE")
    private LocalDate date;

    @Column(name = "APKCAR_TOTAL_PRICE")
    private BigDecimal totalPrice;

    public ApkCar(String license, LocalDate date, BigDecimal totalPrice) {
        this.license = license;
        this.date = date;
        this.totalPrice = totalPrice;
    }
}
