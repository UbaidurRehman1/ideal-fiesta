package com.codemaster.okta.restclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class RestClient {

	public static void main(String[] args) {
		SpringApplication.run(RestClient.class, args);
	}

	@Bean
	PasswordEncoder getEncoder() {
	    return new BCryptPasswordEncoder();
	}

}
