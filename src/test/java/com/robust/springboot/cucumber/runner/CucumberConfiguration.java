package com.robust.springboot.cucumber.runner;

import com.robust.springboot.cucumber.CucumberTestApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = CucumberTestApplication.class)
public class CucumberConfiguration {
}
