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
    public void verifyContactInfo() throws InterruptedException {
        contactPage = new ContactPage(driver);
        contactPage.contactInfo(driver,"Facebook Logo");
    }


//    @AfterTest
//    public void closebrowser() {
//        driver.close();
//        driver.quit();
//
//    }

}