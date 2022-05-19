package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;


public class ProductPage {
    Methods methods;
    FavoritesPage favoritesPage;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {

        methods = new Methods();
        favoritesPage = new FavoritesPage();
    }

    public void searchAndScroll() {
        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("//*[@class='product-cr'][7]"));
        logger.info("7. ürüne scroll edildi.");
        favoritesPage.addToFavorites();
        logger.info("4 Adet ürün favorilere eklendi.");
    }
    public void randomProduct()
    {
        List<WebElement> products = methods.getProducts(By.xpath("//*[@class='product-cr']"));
        int maxProducts = products.size();
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        methods.scrollWithAction(products.get(randomProduct));
        products.get(randomProduct).click();
        methods.click(By.id("button-cart"));
        methods.waitBySeconds(5);
        logger.info("Rastgele bir ürün sepete eklendi.");
    }
}



