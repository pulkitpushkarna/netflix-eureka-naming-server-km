package com.springcloud.demo.km.netflixeurekanamingserverkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaNamingServerKmApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaNamingServerKmApplication.class, args);
	}
}
