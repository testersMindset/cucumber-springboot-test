package com.robust.springboot.cucumber.hooks;

import com.robust.springboot.ui.webdriver.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class CucumberHooks {

    @Before
    public void setUp() {
        System.out.println("Starting Browser...");
        Browser.getDriver();
        open("https://demo.nopcommerce.com/");
    }

    @After
    public void tearDown() {
        Browser.closeBrowser();
    }
}
