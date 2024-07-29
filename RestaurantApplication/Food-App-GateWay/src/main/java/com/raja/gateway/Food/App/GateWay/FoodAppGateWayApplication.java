package com.raja.gateway.Food.App.GateWay;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class FoodAppGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodAppGateWayApplication.class, args);
		log.info("GateWay API is Started...!!");
	}

}
