package com.rozetka.pages;

import com.rozetka.core.DriverFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HomePage extends BasePage {


    @FindBy(xpath = "//img[@alt='Интернет магазин Rozetka.ua - №1']")
    private WebElement logoIcon;

    @Step("Open home page")
    public HomePage openHomePage(){
        DriverFactory.getDriver().get("https://rozetka.com.ua/");
        return this;
    }

    @Step("Check logo displays")
    public void isLogoDisplays(){
        assertThat(logoIcon.isDisplayed(),is(true));
    }

}
