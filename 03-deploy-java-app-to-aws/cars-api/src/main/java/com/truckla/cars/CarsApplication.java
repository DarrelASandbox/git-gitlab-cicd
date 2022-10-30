package com.truckla.cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarsApplication {

	public static void main(String[] args) {
		System.out.println("Entering test");
		SpringApplication.run(CarsApplication.class, args);
	}

}
