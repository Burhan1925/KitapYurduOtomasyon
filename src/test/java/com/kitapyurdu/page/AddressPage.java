package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class AddressPage {
    Methods methods;
    Logger logger;

    public AddressPage() {

        methods = new Methods();
        logger = LogManager.getLogger(AddressPage.class);
    }

    public void addNewAddress()
    {
        if( !methods.isElementVisible(By.xpath("//*[@href='#tab-shipping-new-adress']")))
        {
            methods.waitBySeconds(10);
        }
        methods.click(By.xpath("//*[@href='#tab-shipping-new-adress']"));
        methods.waitBySeconds(5);
        methods.sendKeys(By.cssSelector("#address-firstname-companyname"),"Testinium ");
        methods.sendKeys(By.cssSelector("#address-lastname-title"),"Harikadır");
        methods.selectByText(By.cssSelector("#address-zone-id"), "İzmir");
        methods.waitBySeconds(5);
        methods.selectByText(By.cssSelector("#address-county-id"), "URLA");
        methods.sendKeys(By.cssSelector("#address-address-text"),"Selenium Harikaları");
        methods.sendKeys(By.cssSelector("#address-mobile-telephone"),"5551234567");
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(5);
        logger.info("Yeni adres eklemesi yapıldı.");
    }
}
