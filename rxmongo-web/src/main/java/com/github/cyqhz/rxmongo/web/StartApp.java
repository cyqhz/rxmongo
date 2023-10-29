package com.github.cyqhz.rxmongo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.github.cyqhz.rxmongo"})
@EnableReactiveMongoRepositories(basePackages = {"com.github.cyqhz.rxmongo.repo"})
public class StartApp {

    public static void main(String[] args) {
        SpringApplication.run(StartApp.class);
    }
}
