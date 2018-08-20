package com.bridgelabz.todoconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class ToDoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoConfigServerApplication.class, args);
	}
}
