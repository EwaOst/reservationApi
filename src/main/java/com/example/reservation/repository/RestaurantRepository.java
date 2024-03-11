package com.example.reservation.repository;

import com.example.reservation.model.RestaurantModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<RestaurantModel, Long> {

    Optional<RestaurantModel> findByName (String name);
}
