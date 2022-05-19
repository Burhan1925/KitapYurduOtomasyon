package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.LoginPage;
import com.kitapyurdu.page.LogoutPage;
import org.junit.Before;
import org.junit.Test;

public class LogoutTest extends BaseTest {
    LogoutPage logoutPage;
    LoginPage loginPage;
    @Before
    public void setup()
    {
        logoutPage = new LogoutPage();
        loginPage = new LoginPage();
    }
}

