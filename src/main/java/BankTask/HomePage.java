package BankTask;

import Utilities.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    SeleniumAction seleniumActions;

    public HomePage(WebDriver driver) {

        seleniumActions = new SeleniumAction(driver);
    }

    By logOut = By.xpath("//li/a[text()='Log Out']");
    By clickOnOpenNewAccount = By.xpath("//li/a[text()='Open New Account']");
    By dropDownBox = By.xpath("//select[@id='type']");
    By clickOnNewAccount = By.xpath("//div/input[@type='button']");
    By successfull = By.xpath("//div/h1/following-sibling::p[text()='Congratulations, your account is now open.']");

    public void logoutButton() {
        seleniumActions.clickOnElement(logOut);
    }

    public void openNewAccount() {
        seleniumActions.clickOnElement(clickOnOpenNewAccount);
    }

    public void selectDropDown(String data) {
        seleniumActions.selectByValue1(dropDownBox, data);
    }

    public void newAccount() {
        seleniumActions.clickOnElement(clickOnNewAccount);
    }

    public String successMessage() {
        return seleniumActions.getTextMessage(successfull);
    }

}

