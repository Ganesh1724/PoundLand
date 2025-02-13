package BankTask;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BankTaskTest extends Base {
    Register register;
    HomePage homepage;
    Login login;

    @BeforeClass
    public void initializePages() {

        register = new Register(driver);
        homepage = new HomePage(driver);
        login= new Login(driver);
    }
    @Test
    public void verifySuccessfulLogin() throws InterruptedException {
        register.clickOnregister();
        register.fName="Yashwanth";
        register.lName="Ganesh";
        register.aStreet="Nunna";
        register.aCity="Main road";
        register.aState="AP";
        register.aZipcode="123456";
        register.sssn="521212";
        register.uName="Yashwanth@1234";
        register.pw="1234567890";
        register.rp="1234567890";
        login.lusername="Yashwanth@1234";
        login.lpassword="1234567890";

        register.clickOnfirstName();
        register.clickOnlastName();
        register.clickOnaddressStreet();
        register.clickOnaddressCity();
        register.clickOnaddressState();
        register.clickOnaddressZipcode();
        register.clickOnssn();
        register.clickOnUserName();
        register.clickOnPassword();
        register.clickOnrepeatedPassword();
        register.clickOnsubmit();
        homepage.logoutButton();
        login.enterUserName();
        login.enterpassword();
        login.clickOnLogin();
        homepage.openNewAccount();
        Thread.sleep(5000);
        homepage.selectDropDown("1");
        homepage.newAccount();
        Thread.sleep(2000);
        String v1= homepage.successMessage();
        System.out.println(v1);
        Assert.assertEquals(homepage.successMessage(),"Congratulations, your account is now open.");
    }
}

