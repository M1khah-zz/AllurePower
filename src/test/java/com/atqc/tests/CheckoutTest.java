package com.atqc.tests;

import framework.AllureListener;
import framework.DriverActions;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CheckoutPage;

@Epic("Checkout")
@Feature("Checkout with registration")
@Listeners(AllureListener.class)

public class CheckoutTest extends BaseTest{

    CheckoutPage checkoutPage;

    @Test
    @Story("As a User a User I want to checkout and register from the homepage")
    @Description("Checkout and register")

    public void checkoutAndRegister(){
        DriverActions.scrollDown();
        DriverActions.mouseOver(checkoutPage.addToCartButton);
        checkoutPage.addItemToCart();
        checkoutPage.clickProceedToCheckout();
    };

}
