package com.robust.springboot.cucumber.steps;

import com.robust.springboot.cucumber.datasets.RunConfiguration;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class DummySteps {

    @Autowired
    RunConfiguration runConfiguration;

    @Given("^user tries to enter value in calculator and it works$")
    public void testThisAndCheckItWorks() {
        System.out.println("Starting >>> " + runConfiguration.getTestType());
        System.out.println("Test running in >>> " + runConfiguration.getBrowser());
        System.out.println("This is working correctly...");
    }
}
