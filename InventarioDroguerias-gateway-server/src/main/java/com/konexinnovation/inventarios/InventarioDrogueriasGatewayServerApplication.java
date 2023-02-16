package com.konexinnovation.inventarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")

public class InventarioDrogueriasGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioDrogueriasGatewayServerApplication.class, args);
	}

}
