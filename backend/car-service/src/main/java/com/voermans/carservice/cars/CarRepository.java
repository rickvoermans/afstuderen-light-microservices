package com.voermans.carservice.cars;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    // implement own queries here;
    Optional<Car> findByLicense(String license);
}
