package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.methods.Methods;
import com.kitapyurdu.page.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author BirolCaglar
 */
public class MainScenario extends BaseTest {
    AddressPage addressPage;
    CheckoutPage checkoutPage;
    FavoritesPage favoritesPage;
    HomePage homePage;
    LoginPage loginPage;
    LogoutPage logoutPage;
    ProductPage productPage;
    Methods methods;

    @Before
    public void setup() {
        addressPage = new AddressPage();
        checkoutPage = new CheckoutPage();
        favoritesPage = new FavoritesPage();
        homePage = new HomePage();
        loginPage = new LoginPage();
        logoutPage = new LogoutPage();
        productPage = new ProductPage();
        methods = new Methods();
    }
    @Test
    public void mainScenario() {
        loginPage.login();
        productPage.searchAndScroll();
        homePage.accessHomePage();
        homePage.accessPuanKatalog();
        homePage.accessHobi();
        productPage.randomProduct();
        favoritesPage.accessFavorites();
        favoritesPage.deleteFavorite();
        checkoutPage.goToCheckout();
        checkoutPage.increaseQuantity();
        checkoutPage.goToBuy();
        addressPage.addNewAddress();
        checkoutPage.testUnvalidCart();
        logoutPage.logoutAndControl();
    }
}
