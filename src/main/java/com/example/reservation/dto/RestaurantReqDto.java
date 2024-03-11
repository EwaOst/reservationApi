package com.example.reservation.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestaurantReqDto {

    @NotBlank(message = "Name is required")
    private String name;

}
