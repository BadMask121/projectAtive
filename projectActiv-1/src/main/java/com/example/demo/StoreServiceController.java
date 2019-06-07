package com.example.demo;

/**
 * would improve if given the chance
 * **/

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

public class StoreServiceController {
	
	
	@RequestMapping(value = "/api/stocks/")
	public String listStocks() {
		
		return "list";
	}
	
	@RequestMapping(value = "/api/stocks/1")
	public String getStockById(int id) {
		return "Stock 1";
	}

	public static void main(String[] args) {
		SpringApplication.run(StoreServiceController.class, args);
	}
	

}
