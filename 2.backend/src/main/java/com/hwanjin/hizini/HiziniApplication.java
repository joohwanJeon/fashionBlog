package com.hwanjin.hizini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.hwanjin.hizini")
public class HiziniApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiziniApplication.class, args);
	}

}
