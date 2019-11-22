package cotactTest;

import base.ScriptBase;
import controller.ContactPage;

import org.testng.ITestContext;
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
    public void verifyFacebook() throws InterruptedException {
        contactPage = new ContactPage(driver);
        contactPage.facebook(driver,"Like on Facebook");
    }
    @Test
    public void verifyTwitter() throws InterruptedException {
        contactPage = new ContactPage(driver);
        contactPage.facebook(driver,"Follow @Autobytel on Twitter");
    }

    @Test
    public void verifyGoogle() throws InterruptedException {
        contactPage = new ContactPage(driver);
        contactPage.facebook(driver,"Discuss us on Google+");
    }


    @Test
    public void verifyYouTube() throws InterruptedException {
        contactPage = new ContactPage(driver);
        contactPage.facebook(driver,"View us on YouTube");
    }

    @Test
    public void verifyRSSfeed() throws InterruptedException {
        contactPage = new ContactPage(driver);
        contactPage.facebook(driver,"Subscribe to our RSS feed");
    }
    public void onTestStart(ITestContext result) {

    }


//    @AfterTest
//    public void closebrowser() {
//        driver.close();
//        driver.quit();
//
//    }

}