package com.atqc.tests;

import framework.AllureListener;
import framework.DriverActions;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CreateAccountPage;

@Epic("CreateAccountPage")
@Feature("Create account with all its details")
@Listeners(AllureListener.class)

public class CreateAccountTest extends  BaseTest{

    CreateAccountPage createAccountPage;

    @Test
    public void registerUserWithInfo(){
        createAccountPage.registerUser();
    }
}
