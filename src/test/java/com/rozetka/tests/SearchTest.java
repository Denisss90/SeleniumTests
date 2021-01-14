package com.rozetka.tests;

import com.rozetka.pages.HomePage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchTest extends BaseTest{

    @ParameterizedTest
    @CsvSource(value={"Lenovo Vibe S1","Телевизор Samsung","263334"})
    void checkSearchForProducts(String productName){
        HomePage homePage=new HomePage()
                .openHomePage()
                .search(productName);


    }

}
