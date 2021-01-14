package com.rozetka.tests;

import com.rozetka.pages.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;

@Epic("Rozetka Home page")
public class IsWebSiteAvailableTest extends BaseTest{
    @Test
    @Description("Verify 'Rozetka' logo displays on the page.")
    void checkSiteAvailable(){
        HomePage homePage=new HomePage();
        homePage.openHomePage()
                .isLogoDisplays();
        homePage.checkPageTitle();
    }



}
