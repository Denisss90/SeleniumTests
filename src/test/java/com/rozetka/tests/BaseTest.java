package com.rozetka.tests;

import com.rozetka.core.DriverFactory;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    private static WebDriver driver;

    @BeforeAll
    static void setUp(){
        driver=new DriverFactory(DriverFactory.Browsers.CHROME).getDriver();
    }

    @AfterAll
    static void tearDown(){
        driver.quit();
    }

}
