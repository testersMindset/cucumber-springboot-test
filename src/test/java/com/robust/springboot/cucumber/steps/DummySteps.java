package com.robust.springboot.cucumber.steps;

import com.robust.springboot.cucumber.datasets.RunConfiguration;
import com.robust.springboot.cucumber.pages.HomePage;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

import static com.codeborne.selenide.Selenide.page;

public class DummySteps {

    @Autowired
    RunConfiguration runConfiguration;

    @Given("^user tries to enter value in calculator and it works$")
    public void testThisAndCheckItWorks() {
        System.out.println("Starting >>> " + runConfiguration.getTestType());
        System.out.println("Test running in >>> " + runConfiguration.getBrowser());
        System.out.println("This is working correctly...");
    }


    @Given("^user validates links dropdown on the menu are working correctly$")
    public void testThisSiteIsOpen() {
        HomePage homePage = page(HomePage.class);
        System.out.println("Successfully opened the page...");
        homePage.computersMenuLink.click();
    }
}
