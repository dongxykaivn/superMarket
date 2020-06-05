package com.ant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringbootWebApplication {
    private static final Logger LOGGER=Logger.getLogger(SpringbootWebApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApplication.class);
    }
}
