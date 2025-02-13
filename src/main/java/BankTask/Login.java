package BankTask;

import Utilities.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    Login login;
    String lusername, lpassword;
    SeleniumAction seleniumActions;

    public Login(WebDriver driver) {

        seleniumActions = new SeleniumAction(driver);
    }

    By username = By.xpath("//div/input[@name='username']");
    By password = By.xpath("//div/input[@name='password']");
    By login1 = By.xpath("//div/input[@type='submit']");

    public void enterUserName() {
        seleniumActions.enterValue(username, lusername);
    }

    public void enterpassword() {
        seleniumActions.enterValue(password, lpassword);
    }

    public void clickOnLogin() {
        seleniumActions.elementNot1(login1);
    }
}

