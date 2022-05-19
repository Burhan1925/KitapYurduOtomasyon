package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;
    Logger logger;

    public LoginPage() {
        methods = new Methods();
        logger = LogManager.getLogger(LoginPage.class);
    }

    public void login()
    {
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.sendKeys(By.id("login-email"),"seleniumProjeMail@gmail.com");
        methods.sendKeys(By.xpath("//input[@id='login-password']"),"p@$$w0rd.!");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(10);
        String getLoginText = methods.getText(By.cssSelector(".menu.top.login"));
        Assert.assertEquals("Kullanıcı girisi yapılamadı.",getLoginText,"Merhaba Test Kullanicisi");
        logger.info("Giriş işlemi sağlandı.");
    }
}
