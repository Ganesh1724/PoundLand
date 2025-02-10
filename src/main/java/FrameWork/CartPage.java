package FrameWork;

import Utilities.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    SeleniumActions seleniumActions;
    public CartPage(WebDriver driver){
        seleniumActions=new SeleniumActions(driver);
    }

    By cartButton=By.xpath("(//span[@class='basket-amount']/span/span[@class='price'])[2]");
    By cartProductText=By.xpath("//div[contains(@class,'item-details')]/strong/a");
    By cartProductPrice=By.xpath("//span[@class='cart-price']/span");

    public void clickOnCartButton(){
        seleniumActions.clickOnElement(cartButton);
    }
    public String getCartProductText(){
        return seleniumActions.getTextMessage(cartProductText);
    }
    public String getCartProductPrice(){
        return seleniumActions.getTextMessage(cartProductPrice);
    }
}
