package com.mfirmanakbar.loginpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootRegistrationLoginApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootRegistrationLoginApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRegistrationLoginApplication.class, args);
	}

}
