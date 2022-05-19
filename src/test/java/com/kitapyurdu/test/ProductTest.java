package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.methods.Methods;
import com.kitapyurdu.page.LoginPage;
import com.kitapyurdu.page.ProductPage;
import org.junit.Before;


public class ProductTest extends BaseTest {
    ProductPage productPage;
    Methods methods;
    LoginPage loginPage;

    @Before
    public void setupMetods() {

        productPage = new ProductPage();
        loginPage = new LoginPage();
        methods = new Methods();
    }
}
