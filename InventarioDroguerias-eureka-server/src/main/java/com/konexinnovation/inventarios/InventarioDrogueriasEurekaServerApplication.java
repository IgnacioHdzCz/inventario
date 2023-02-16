package com.konexinnovation.inventarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InventarioDrogueriasEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioDrogueriasEurekaServerApplication.class, args);
	}

}
