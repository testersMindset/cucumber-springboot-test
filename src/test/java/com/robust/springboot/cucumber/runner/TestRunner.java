package com.robust.springboot.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources",
        glue="classpath:com.robust.springboot.cucumber",
        stepNotifications = true,
        publish = false
)
public class TestRunner {
}
