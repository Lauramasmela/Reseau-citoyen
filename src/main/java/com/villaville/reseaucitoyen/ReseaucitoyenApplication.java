package com.villaville.reseaucitoyen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ReseaucitoyenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReseaucitoyenApplication.class, args);
	}

}
