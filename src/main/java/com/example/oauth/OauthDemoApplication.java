package com.example.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.oauth.repo")
public class OauthDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthDemoApplication.class, args);
	}

}
