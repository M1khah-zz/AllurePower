package com.atqc.tests;

import framework.DriverActions;
import framework.PlatformFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    private static String URL="http://automationpractice.com/index.php";

    @BeforeMethod(alwaysRun = true)
    public void beforeTest() {
        PlatformFactory.initDriver();
        DriverActions.open(URL);
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest() {

        PlatformFactory.closeDriver();

    }
}
