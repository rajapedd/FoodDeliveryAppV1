package com.raja.restaurantService.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @GetMapping("/api/test")
    public String getRestaurants(){
        return "Restaurant API Call Success";
    }
}
