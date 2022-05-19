package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class HomePage {
    Methods methods;
    Logger logger;

    public HomePage() {
        methods = new Methods();
        logger = LogManager.getLogger(HomePage.class);
    }
    public void accessHomePage()
    {
        methods.click(By.cssSelector(".logo-icon"));
        methods.waitBySeconds(2);
        logger.info("Anasayfaya yönlendirildi.");
    }
    public void accessHobi(){
        methods.clickWithText("span","Tüm Kitaplar");
        methods.waitBySeconds(3);
        methods.clickWithText("a","Hobi");
        logger.info("Hobi sekmesine tıklandı.");

    }
    public void accessPuanKatalog(){
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//select[@onchange='location = this.value;']"), "Yüksek Oylama");
        methods.waitBySeconds(2);
        logger.info("Puan kataloğuna tıklandı.");
    }
}
