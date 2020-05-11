package com.atqc.tests;

import framework.AllureListener;
import framework.DriverActions;
import io.qameta.allure.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import static org.hamcrest.MatcherAssert.assertThat;


@Epic("HomePage")
@Feature("Home Page Search")
@Listeners(AllureListener.class)

public class HomeTest extends BaseTest{

    HomePage homePage;

    @Test
    @Story("As a User a User I want to perform search on homepage")
    @Description("Test for search on Homepage")

    public void performSearchOnHomePage() {
        DriverActions.open("http://automationpractice.com/index.php");
        homePage = new HomePage();
        homePage.inputSearchParameters("res");
        homePage.submitSearch();
        assertThat(homePage.getSearchName(), equals("RES"));
    }

    @Test
    @Story("As a User I want to be able to proceed to account creation page")
    public void createUser() {
        homePage = new HomePage();
        homePage.clickSignIn();
        assertThat(homePage.getAuthHeader(), equals("Authentication"));
        homePage.createUser();
    }

    @DataProvider(name = "invalidEmail")
    public Object[][] invalidEmails() {
        return new Object[][] { { "qwerty" }, { "test@testcom" } };
    }

    @Test(dataProvider = "invalidEmail")
    @Story("Check email validation")
    public void createInvalidUser(String email){
        homePage = new HomePage();
        homePage.clickSignIn();
        homePage.inputSignUpEmail(email);
    }
}
