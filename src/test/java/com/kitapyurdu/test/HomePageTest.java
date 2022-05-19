package com.kitapyurdu.test;
import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.HomePage;
import com.kitapyurdu.page.ProductPage;
import org.junit.Before;


public class HomePageTest extends BaseTest {
    HomePage homePage ;
    ProductPage productPage ;
     @Before
     public void setupMetods(){
         homePage = new HomePage();
         productPage = new ProductPage();
     }


}
