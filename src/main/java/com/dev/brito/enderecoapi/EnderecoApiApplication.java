package com.dev.brito.enderecoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EnderecoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnderecoApiApplication.class, args);
	}

}
