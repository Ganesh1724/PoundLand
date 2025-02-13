package BankTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
    SeleniumAction seleniumActions;
    public Register(WebDriver driver){
        seleniumActions=new SeleniumAction(driver);

    }
    String fName,lName,aStreet,aCity,aState,aZipcode,sssn,uName,pw,rp;
    By register =By.xpath("//p/a[text()='Register']");
    By firstName=By.xpath("//td/input[@name='customer.firstName']");
    By lastName=By.xpath("//td/input[@name='customer.lastName']");
    By addressStreet=By.xpath("//td/input[@name='customer.address.street']");
    By addressCity=By.xpath("//td/input[@name='customer.address.city']");
    By addressState=By.xpath("//td/input[@name='customer.address.state']");
    By addressZipcode=By.xpath("//td/input[@name='customer.address.zipCode']");
    By ssn=By.xpath("//td/input[@name='customer.ssn']");
    By UserName=By.xpath("//td/input[@name='customer.username']");
    By Password=By.xpath("//td/input[@name='customer.password']");
    By repeatedPassword=By.xpath("//td/input[@name='repeatedPassword']");
    By Submit=By.xpath("//td/input[@type='submit']");


    public void clickOnregister(){
        seleniumActions.clickOnElement(register);
    }
    public void clickOnfirstName(){
        seleniumActions.enterValue(firstName,fName);
    }
    public void clickOnlastName(){
        seleniumActions.enterValue(lastName,lName);
    }
    public void clickOnaddressStreet(){
        seleniumActions.enterValue(addressStreet,aStreet);
    }
    public void clickOnaddressCity(){
        seleniumActions.enterValue(addressCity,aCity);
    }
    public void clickOnaddressState(){
        seleniumActions.enterValue(addressState,aState);
    }
    public void clickOnaddressZipcode(){
        seleniumActions.enterValue(addressZipcode,aZipcode);
    }
    public void clickOnssn(){
        seleniumActions.enterValue(ssn,sssn);
    }
    public void clickOnUserName(){
        seleniumActions.enterValue(UserName,uName);
    }
    public void clickOnPassword(){
        seleniumActions.enterValue(Password,pw);
    }
    public void clickOnrepeatedPassword(){
        seleniumActions.enterValue(repeatedPassword,rp);
    }
    public void clickOnsubmit(){
        seleniumActions.elementNot1(Submit);
    }





}
