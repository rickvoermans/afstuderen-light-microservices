package com.voermans.apkservice.rabbitmq;

import com.voermans.apkservice.apk.ApkCar;
import java.time.LocalDate;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ApkMessage {
    private String license;
    private LocalDate apkDate;

    public static ApkMessage from(ApkCar apkCar) {
        return new ApkMessage(apkCar.getLicense(), apkCar.getDate());
    }
}
