package com.atqc.tests;

import framework.AllureListener;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import static org.testng.Assert.*;


@Epic("CreateAccountPage")
@Feature("Create account with all its details")
@Listeners(AllureListener.class)

public class CreateAccountTest extends  BaseTest{

    CreateAccountPage createAccountPage;

    @Test
    @Story("As a user I want to create an account")
    public void registerUserWithInfo(){
        createAccountPage = new CreateAccountPage();
        createAccountPage.createUser();
        assertEquals(createAccountPage.getPageTitle(), ("AUTHENTICATION"));
        createAccountPage.registerUser();
        assertEquals(createAccountPage.getPageTitle(), ("MY ACCOUNT"));
    }
}
