package com.robust.springboot.cucumber.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public SelenideElement computersMenuLink = $("a[href='/computers']");
    public SelenideElement registerLink = $(".ico-register");


}
