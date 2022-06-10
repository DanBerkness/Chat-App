package com.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.chat"})
public class Chat1Application {

	public static void main(String[] args) {
		SpringApplication.run(Chat1Application.class, args);
	}

}
