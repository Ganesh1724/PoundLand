package Tests;

import FrameWork.Base;
import FrameWork.CartPage;
import FrameWork.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PoundLandTests extends Base {
    HomePage homePage;
    CartPage cartPage;

    @BeforeClass
    public void initializePages(){
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
    }

    @Test
    public void verifyingProductSearchAndAddToCartFunctionality() throws InterruptedException {
        homePage.clickOnCaptchaButton();
        homePage.clickOnProductSearchBar();
        Thread.sleep(5000);
        homePage.clickOnSearchIcon();
        String searchProductText=homePage.getProductText();
        String searchProductPrice=homePage.getProductPrice();
        System.out.println(searchProductText);
        System.out.println(searchProductPrice);
        homePage.clickOnAddButton();
        Thread.sleep(5000);

        cartPage.clickOnCartButton();
        String addedProductText=cartPage.getCartProductText();
        String addedProductPrice=cartPage.getCartProductPrice();
        System.out.println(addedProductText);
        System.out.println(addedProductPrice);
        Assert.assertEquals(searchProductText,addedProductText);
        Assert.assertEquals(searchProductPrice,addedProductPrice);
    }
}
