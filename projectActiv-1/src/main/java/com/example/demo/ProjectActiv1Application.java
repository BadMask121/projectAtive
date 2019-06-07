package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@ComponentScan(basePackages = { "com.example.demo" })
@RestController
@EnableAutoConfiguration

public class ProjectActiv1Application {
	
	
	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping(value = "/home")
	public String home() {
		return "Welcome To Home Page";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjectActiv1Application.class, args);
	}
	

}
