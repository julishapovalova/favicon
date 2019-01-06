package com.realfavicongenerator.tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    @BeforeSuite
    @Step("set enviroment")
    public void setUpEnviroment() {
        Configuration.baseUrl = "https://realfavicongenerator.net/";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 8000;
        Configuration.headless = true;
    }
}
