package cotactTest;

import base.ScriptBase;
import controller.ContactPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactTest extends ScriptBase {

    ContactPage contactPage;

    @BeforeTest
    public void beforetest() {
        init();
    }

    @Test
    public void verifyContactInfo() {
        contactPage = new ContactPage(driver);
        contactPage.contactInfo(driver);
    }

    @Test
    public void verifytermsOfUse() {
        contactPage = new ContactPage(driver);
        contactPage.termsOfUse(driver);
    }

    @Test
    public void verifyprivacyPolicy() {
        contactPage = new ContactPage(driver);
        contactPage.privacyPolicy(driver);
    }
    @AfterTest
    public void closebrowser() {
        driver.close();
        driver.quit();

    }

}