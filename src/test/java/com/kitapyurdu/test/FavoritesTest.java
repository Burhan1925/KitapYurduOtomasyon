package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.methods.Methods;
import com.kitapyurdu.page.FavoritesPage;
import com.kitapyurdu.page.LoginPage;
import org.junit.Before;


public class FavoritesTest extends BaseTest {
    LoginPage loginPage;
    FavoritesPage favoritesPage;
    Methods methods;
    @Before
    public void setupMethods() {
        loginPage = new LoginPage();
        favoritesPage = new FavoritesPage();
        methods = new Methods();
    }

}
