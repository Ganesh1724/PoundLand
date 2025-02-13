package BankTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SeleniumAction {
    WebDriver driver;

    public SeleniumAction(WebDriver driver) {
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
    public void elementNot1(By by){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element1.click();

    }

    public void selectByValue1(By by, String value) {
        WebElement element = driver.findElement(by);
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public String getFirstProductData(By by){
        List<WebElement> elements=driver.findElements(by);
        String data=elements.get(1).getText();
        return data;
    }
    public void moveTOElement(By by){
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();

    }
    public void clickOnElement1(By by){
        List<WebElement> elements=driver.findElements(by);
        elements.get(1).click();

    }
}



