package com.cogni.action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.cogni.action.model")
public class ActionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActionDemoApplication.class, args);
	}

}
