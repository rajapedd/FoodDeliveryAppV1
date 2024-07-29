package com.raja.foodDelivery.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class FoodDeliveryController {


    @GetMapping("/callTest")
    public String deliveryTest(){
        return "Food Delivery Call Success";
    }
}
