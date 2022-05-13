package com.robust.springboot.cucumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.robust.springboot")
public class CucumberTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CucumberTestApplication.class);
    }
}
