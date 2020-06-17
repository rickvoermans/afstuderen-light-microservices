package com.voermans.carservice.rabbitmq;

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
}
