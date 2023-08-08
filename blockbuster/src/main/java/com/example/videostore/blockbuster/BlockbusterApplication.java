package com.example.videostore.blockbuster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// @SpringBootApplication
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class BlockbusterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlockbusterApplication.class, args);
	}
}
