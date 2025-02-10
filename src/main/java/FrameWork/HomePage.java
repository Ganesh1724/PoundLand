package FrameWork;

import Utilities.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    SeleniumActions seleniumActions;

    public HomePage(WebDriver driver){
        seleniumActions=new SeleniumActions(driver);
    }

    By captchaButton=By.xpath("(//button[normalize-space()='Accept All Cookies'])[1]");
    By productSearch=By.xpath("//input[@id='search']");
    By suggestionProduct=By.xpath("(//ul[contains(@id,'acList')]/li/a)[1]");
    By searchIcon=By.xpath("//button[@type='submit' and @title='Search']");
    By productText=By.xpath("//span[contains(@class,'item-name')]/a");
    By productPrice=By.xpath("//span[@class='decimal']/../parent::span");
    By addButton=By.xpath("//button[@type='submit' and @title='Add']/span");

    public void clickOnCaptchaButton(){
        seleniumActions.clickOnElement(captchaButton);
    }
    public void clickOnProductSearchBar(){
        seleniumActions.enterValue(productSearch,"pepsi");
    }
    public void clickOnSuggestionItem(){
        seleniumActions.clickOnElement(suggestionProduct);
    }
    public void clickOnSearchIcon(){
        seleniumActions.clickOnElement(searchIcon);
    }
    public String getProductText(){
        return seleniumActions.getTextMessage(productText);
    }
    //    public String getProductPrice(){
//        return  seleniumActions.getTextMessage(productPrice);
//    }
    public String getProductPrice(){
        return seleniumActions.getFirstProductData(productPrice);
    }
    public void clickOnAddButton(){
        seleniumActions.clickOnElement(addButton);
    }
    public void move(){
        seleniumActions.moveTOElement(productSearch);
    }

}
