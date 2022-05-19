package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FavoritesPage {
    Logger logger;
    Methods methods;
    LoginPage loginPage;

    public FavoritesPage() {
        loginPage = new LoginPage();
        methods = new Methods();
        logger = LogManager.getLogger(FavoritesPage.class);
    }

    public void addToFavorites() {
        boolean favoriteCheck = false;
        List<WebElement> product = methods.getProducts(By.xpath("//*[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        for (int i = 8; i <= 11; i++) {
            methods.scrollWithAction(product.get(i));
            product.get(i).click();
            methods.waitBySeconds(1);
            favoriteCheck = methods.isElementVisible(By.id("swal2-title"));
            if (!favoriteCheck) {
                logger.warn("Favorilere eklenemedi.");
            } else {
                logger.info("Favorilere başarı ile eklendi.");
            }
        }
    }

    public void accessFavorites() {
        methods.mouseHover(By.cssSelector(".menu.top.my-list"));
        methods.clickWithText("a", "Favorilerim");
        methods.waitBySeconds(5);
        logger.info("Favoriler sayfasına giriş yapıldı.");
    }
    public void deleteFavorite()
    {
        methods.click(By.xpath("(//*[@class='fa fa-heart-o'])[3]"));
        methods.waitBySeconds(3);
        logger.info("3. sıradaki favori ürün silindi.");
    }
}
