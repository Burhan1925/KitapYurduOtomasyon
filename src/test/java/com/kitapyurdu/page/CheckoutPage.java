package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CheckoutPage {
    Methods methods;
    Logger logger;

    public CheckoutPage() {
        methods = new Methods();
        logger = LogManager.getLogger(CheckoutPage.class);
    }

    public void goToCheckout() {
        methods.scrollWithAction(By.cssSelector(".common-sprite.fl"));
        methods.click(By.cssSelector(".common-sprite.fl"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("#js-cart"));
        methods.waitBySeconds(2);
        logger.info("Sepete tıklama sağlandı ve yönlendirilmesi sağlandı.");
    }

    public void increaseQuantity(){

        methods.sendKeys(By.xpath("//input[@name='quantity']"),"5");
        methods.waitBySeconds(2);
        methods.click(By.xpath("(//i[@class='fa fa-refresh green-icon'])[1]"));
        methods.waitBySeconds(5);
        logger.info("Sepet içerisinde ürün adeti arttırıldı.");
    }
    public void goToBuy(){
        methods.waitBySeconds(5);
        methods.click(By.xpath("//a[@class='button red']"));
        logger.info("Sepet içerisinde satın alma butonuna tıklandı.");
    }

    public void testUnvalidCart() {
        if( !methods.isElementVisible(By.cssSelector("#button-checkout-continue")))
        {
            methods.waitBySeconds(10);
        }
        methods.click(By.cssSelector("#button-checkout-continue"));
        methods.waitBySeconds(2);
        if( !methods.isElementVisible(By.cssSelector("#credit-card-owner")))
        {
            methods.waitBySeconds(10);
        }
        methods.sendKeys(By.cssSelector("#credit-card-owner"), "Testinium Test");
        methods.sendKeys(By.cssSelector("#credit_card_number_1"), "1111");
        methods.sendKeys(By.cssSelector("#credit_card_number_2"), "1111");
        methods.sendKeys(By.cssSelector("#credit_card_number_3"), "1111");
        methods.sendKeys(By.cssSelector("#credit_card_number_4"), "1111");
        methods.selectByText(By.cssSelector("#credit-card-expire-date-month"), "01");
        methods.selectByText(By.cssSelector("#credit-card-expire-date-year"), "2022");
        methods.sendKeys(By.cssSelector("#credit-card-security-code"), "test");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("#button-checkout-continue"));
        methods.waitBySeconds(2);
        String expected = "Kart numarası geçersiz. Kontrol ediniz!";
        Assert.assertEquals("testUnvalidCart > Test Failed!  ", expected, methods.getText(By.xpath("//span[@class='error']")));
        methods.waitBySeconds(2);
        logger.info("Geçersiz kart bilgileri girildi, hata mesajı alındı.");
    }
}
