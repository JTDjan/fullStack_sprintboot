package com.example.fullStackProject_Josh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})


public class FullStackProjectJoshApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackProjectJoshApplication.class, args);
	}

}
