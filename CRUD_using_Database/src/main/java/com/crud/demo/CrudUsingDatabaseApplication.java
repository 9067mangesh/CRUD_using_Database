package com.crud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudUsingDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudUsingDatabaseApplication.class, args);
		System.out.println("Welcome to the Application");
	}

}
