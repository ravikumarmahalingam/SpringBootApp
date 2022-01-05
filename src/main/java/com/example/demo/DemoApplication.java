package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//This annotation is required to scan the service, model and controller classes
@ComponentScan(basePackages = {"com.example.demo", "com.example.model", "com.example.service"})
//This annotation is required and if it is not there then we will not be able to
//autowire the repository clas
@EnableJpaRepositories("com.example.repository")
//This annotation is required and if it is not there then springboot is not able to
//recognise the entity
@EntityScan("com.example.model")

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
