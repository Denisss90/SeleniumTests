package com.rozetka.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static WebDriver driver;
    private static WebDriverWait waitVar;

    public enum Browsers {
        FIREFOX, CHROME
    }

    public DriverFactory(Browsers browser)  {

        if(browser.equals(Browsers.CHROME)){
            WebDriverManager.chromedriver().config().setAvoidAutoReset(true);
            WebDriverManager.chromedriver().clearResolutionCache().forceDownload().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(7000, TimeUnit.MILLISECONDS);
            driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
            waitVar = new WebDriverWait(driver, 5);
        }
        if(browser.equals(Browsers.FIREFOX)){
            // Need to be done in future
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getWaitVar() {
        return waitVar;
    }
}
