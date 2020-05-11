package com.atqc.tests;

import framework.AllureListener;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import static org.hamcrest.MatcherAssert.assertThat;

@Epic("CreateAccountPage")
@Feature("Create account with all its details")
@Listeners(AllureListener.class)

public class CreateAccountTest extends  BaseTest{

    CreateAccountPage createAccountPage;

    @Test
    @Story("As a user I want to create an account")
    public void registerUserWithInfo(){
        createAccountPage = new CreateAccountPage();
        assertThat(createAccountPage.getPageTitle(), equals("Create an account"));
        createAccountPage.registerUser();
        assertThat(createAccountPage.getPageTitle(), equals("My account"));
    }
}
