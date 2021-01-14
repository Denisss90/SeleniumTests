package com.rozetka.pages;

import com.rozetka.core.DriverFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class HomePage extends BasePage {


    @FindBy(xpath = "//img[@alt='Интернет магазин Rozetka.ua - №1']")
    private WebElement logoIcon;

    @FindBy(xpath = "//*[@class='search-form__input ng-untouched ng-pristine ng-valid']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[text()=' Найти ']")
    private WebElement searchBtn;


    @Step("Open home page")
    public HomePage openHomePage(){
        DriverFactory.getDriver().get("https://rozetka.com.ua/");
        return this;
    }

    @Step("Check logo displays")
    public void isLogoDisplays(){
        assertThat(logoIcon.isDisplayed(),is(true));
    }

    @Step("Check the pate title")
    public void checkPageTitle(){
        assertThat(DriverFactory.getDriver().getTitle(),equalTo("Интернет-магазин ROZETKA™: официальный сайт самого популярного онлайн-гипермаркета в Украине"));
    }

    @Step("Search for ")
    public HomePage search(String text){
        DriverFactory.getWaitVar().until(ExpectedConditions.visibilityOf(searchInput));
        searchInput.click();
        searchInput.sendKeys(text);
        searchBtn.click();

        return this;
    }

}
