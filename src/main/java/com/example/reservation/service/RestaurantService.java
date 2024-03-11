package com.example.reservation.service;

import com.example.reservation.model.RestaurantModel;
import com.example.reservation.repository.RestaurantRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.hibernate.boot.model.naming.Identifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantService {


    private final RestaurantRepository restaurantRepository;

    public RestaurantModel createNewRestaurant(String name) {
        RestaurantModel restaurant = new RestaurantModel();
        restaurant.setName(name);
        restaurant.setId(restaurant.getId());
        return restaurant;

    }

    public RestaurantModel updateRestaurant(String name, String restaurantJson) {
        RestaurantModel restaurant = restaurantRepository.findByName(name)
                .orElseThrow(() -> new EntityNotFoundException("Restaurant not found"));
        restaurant.setRestaurant(restaurantJson);
        return restaurantRepository.save(restaurant);

    }
}