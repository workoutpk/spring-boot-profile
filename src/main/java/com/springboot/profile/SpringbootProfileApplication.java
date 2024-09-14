package com.springboot.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringbootProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProfileApplication.class, args);
		System.out.println("Spring Boot Profile Running ............................");
	}
	
	
	@Profile("dev")
    @Bean
    public String devBean() {
        return "dev";
    }

    @Profile("qa")
    @Bean
    public String qaBean() {
        return "qa";
    }

    @Profile("prod")
    @Bean
    public String prodBean() {
        return "prod";
    }
}
