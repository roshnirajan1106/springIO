package com.db.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoSpringProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringProject2Application.class, args);
		System.out.println("Helloo");
		System.out.println("world");
	}

}
