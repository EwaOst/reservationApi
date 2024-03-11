package com.example.reservation.controller;

import com.example.reservation.dto.RestaurantReqDto;

import com.example.reservation.model.RestaurantModel;
import com.example.reservation.service.RestaurantService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurant")
@Tag(name = "Restaurant Controller", description = "Endpoints for mapping restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Operation(summary = "Create restaurant", description = "Creates a new restaurant based on the provided name.")
    @PostMapping("/create")
    public ResponseEntity<RestaurantModel> createNewRestaurant(@RequestParam String name) {
        RestaurantModel restaurant = restaurantService.createNewRestaurant(name);
        return new ResponseEntity<>(restaurant, HttpStatus.CREATED);

    }

    @Operation(summary = "Add or update informations", description = "Updates an existing configuration with new data.")
    @PutMapping("update/{name}")
    public ResponseEntity<RestaurantModel> updateRestaurant (@PathVariable String name, String restaurantJson) {
        RestaurantModel updateConfiguration = restaurantService.updateRestaurant(name, restaurantJson);
        return ResponseEntity.ok(updateConfiguration);
    }
}
