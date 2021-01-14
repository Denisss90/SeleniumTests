package com.rozetka.pages;

import com.rozetka.core.DriverFactory;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(DriverFactory.getDriver(),this);
    }
    public WebDriverWait wait=DriverFactory.getWaitVar();
}
