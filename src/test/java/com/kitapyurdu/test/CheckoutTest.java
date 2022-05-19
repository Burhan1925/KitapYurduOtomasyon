package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.CheckoutPage;
import com.kitapyurdu.page.LoginPage;
import org.junit.Before;


public class CheckoutTest extends BaseTest {
    CheckoutPage checkoutPage;
    LoginPage loginPage;


    @Before
    public void setupMethods() {
        checkoutPage = new CheckoutPage();
        loginPage = new LoginPage();
    }
}
