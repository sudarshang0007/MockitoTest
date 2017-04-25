package com.plm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



//@ComponentScan("com.plm.*")
@SpringBootApplication
@EnableDiscoveryClient
public class Application {
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "accounts-server");
		SpringApplication.run(Application.class, args);
	}

}

