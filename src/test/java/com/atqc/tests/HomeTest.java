package com.atqc.tests;

import framework.AllureListener;
import framework.DriverActions;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.GooglePage;
import pages.HomePage;

@Epic("HomePage")
@Feature("Home Page Test")
@Listeners(AllureListener.class)
public class HomeTest extends BaseTest{

    HomePage homePage;

    @Test
    @Story("Never ending story")
    @Description("Test for Homepage")

    public void openHomePage() {

        DriverActions.open("http://automationpractice.com/index.php");
        homePage = new HomePage();
        homePage.inputSearchParameters("res");

    }
}
