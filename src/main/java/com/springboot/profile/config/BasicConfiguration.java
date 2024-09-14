package com.springboot.profile.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import lombok.Data;

@Component
@ConfigurationProperties("basic")
@Data

public class BasicConfiguration {
	private boolean value;
    private String message;
    private int number;

    //GETTERS AND SETTER
}
