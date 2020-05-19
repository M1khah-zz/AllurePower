package com.atqc.tests;

import framework.AllureListener;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CreateAccountPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;


@Epic("CreateAccountPage")
@Feature("Create account with all its details")
@Listeners(AllureListener.class)

public class CreateAccountTest extends  BaseTest{

    CreateAccountPage createAccountPage;

    @Test
    @Story("As a user I want to create an account with valid data")
    public void positiveRegisterUser(){
        createAccountPage = new CreateAccountPage();
        createAccountPage.createAccountValidEmail();
        assertThat(createAccountPage.getPageTitle(),is("AUTHENTICATION"));
        createAccountPage.registerValidUser();
        assertThat(createAccountPage.getPageTitle(), is("MY ACCOUNT"));
    }

    @Test(dataProvider = "invalidEmails")
    @Story("As a user I want to click create account with invalid data and verify errors")
    public void negativeCreateAccount(String invalidEmail, String message){
        createAccountPage = new CreateAccountPage();
        createAccountPage.createAccountInvalid(invalidEmail);
        assertThat(createAccountPage.emailError, is(notNullValue()));
        assertThat(createAccountPage.emailError.getText(), is(message));
    }

    @DataProvider(name = "invalidEmails")
    private Object[][] provider() {

        return new Object[][] {

                {"", "Invalid email address."},
                {"!@#$", "Invalid email address."},
                {"qww", "Invalid email address."},
                {"test@testcom", "Invalid email address."},
                {"@testcom", "Invalid email address."}

        };
    }
}
