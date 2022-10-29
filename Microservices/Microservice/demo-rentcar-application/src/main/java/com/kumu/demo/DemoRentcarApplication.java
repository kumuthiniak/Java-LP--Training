package com.kumu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.kumu.demo.controller"})
public class DemoRentcarApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRentcarApplication.class, args);
	}

}
