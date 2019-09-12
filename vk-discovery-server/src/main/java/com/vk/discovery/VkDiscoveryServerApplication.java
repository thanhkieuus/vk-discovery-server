package com.vk.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VkDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VkDiscoveryServerApplication.class, args);
	}

}
