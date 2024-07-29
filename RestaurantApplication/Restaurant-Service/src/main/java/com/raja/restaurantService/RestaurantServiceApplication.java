package com.raja.restaurantService;

import lombok.Getter;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@Log4j2
public class RestaurantServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestaurantServiceApplication.class, args);
		log.info("Restaurant Service Started");
	}

}
