package com.arkenidar.springstudyweb;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringStudyWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStudyWebApplication.class, args);
	}

}
