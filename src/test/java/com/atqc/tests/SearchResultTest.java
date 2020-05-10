package com.atqc.tests;

import framework.AllureListener;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SearchResultPage;


@Epic("SRP")
@Feature("See search results on SRP")
@Listeners(AllureListener.class)

public class SearchResultTest extends BaseTest {

    SearchResultPage srp;

    @Test
    @Story("As a user I want to see search results on SRP")

    public void checkResults() {

    }
}
