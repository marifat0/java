package com.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
        System.out.println("Hello, World!");
        String name = null;
        name = "Noel";
        System.out.println("Name: " + name);
        System.out.println();
	}
}
