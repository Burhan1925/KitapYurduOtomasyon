package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LogoutPage {
    Methods methods;
    Logger logger;
    public LogoutPage() {
        methods = new Methods();
        logger = LogManager.getLogger(LogoutPage.class);
    }

    public void logoutAndControl() {
        HomePage homePage = new HomePage();
        methods.click(By.cssSelector(".checkout-logo"));
        methods.waitBySeconds(2);
        String getLoginText = methods.getText(By.cssSelector(".menu.top.login"));
        methods.mouseHover(By.cssSelector(".menu.top.login"));
        methods.waitBySeconds(5);
        methods.clickWithText("a", "Çıkış"); // hobi yazılan yer gibi yaz xpath
        methods.waitBySeconds(5);
        Assert.assertNotEquals("Kullanıcı çıkışı sağlanamadı", getLoginText, "Giriş Yap");
        logger.info("Çıkış işlemi sağlandı.");
    }
}
