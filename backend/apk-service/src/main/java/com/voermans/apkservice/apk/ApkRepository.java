package com.voermans.apkservice.apk;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApkRepository extends CrudRepository<ApkCar, Long> {

    Optional<ApkCar> findByLicense(String license);

}
