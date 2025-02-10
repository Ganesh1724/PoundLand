package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumActions {
    WebDriver driver;

    public SeleniumActions(WebDriver driver) {
        this.driver=driver;
    }



    public void enterValue(WebElement element, String data){
        element.sendKeys(data);
    }

    public void enterValue(By by, String data){
        driver.findElement(by).sendKeys(data);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    public String getTextMessage(WebElement element){
        return element.getText();
    }

    public String getTextMessage(By by){
        return driver.findElement(by).getText();
    }

    public void selectByValue1(WebElement dropdown, String value) {
        Select select = new Select(dropdown);
        select.selectByValue(value);
    }
    public String getFirstProductData(By by){
        List<WebElement> elements=driver.findElements(by);
        String data=elements.get(0).getText();
        return data;
    }
    public void moveTOElement(By by){
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();

    }
}
