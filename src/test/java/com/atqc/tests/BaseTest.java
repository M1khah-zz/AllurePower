package com.atqc.tests;

import framework.PlatformFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static framework.DriverActions.open;

public class BaseTest {
    private static final String URL="http://automationpractice.com/index.php";

    @BeforeMethod(alwaysRun = true)
    public void beforeTest() {
        PlatformFactory.initDriver();
        open(URL);
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest() {
 
        PlatformFactory.closeDriver();

    }
}
