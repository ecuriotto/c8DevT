package com.training.zeebeclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.camunda.zeebe.spring.client.EnableZeebeClient;

@SpringBootApplication
@EnableZeebeClient

public class ZeebeClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeebeClientApplication.class, args);
	}

}
