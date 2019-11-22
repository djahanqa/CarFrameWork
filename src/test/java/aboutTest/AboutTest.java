package aboutTest;

import base.ScriptBase;
import controller.AboutPage;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AboutTest extends ScriptBase {
    AboutPage aboutPage;

    @BeforeTest
    public void beforetest() {
        init();
    }

    @Test
    public void verifyAboutInfo() throws InterruptedException {
        aboutPage = new AboutPage(driver);
        aboutPage.aboutInfo(driver,"About");
    }

    @AfterTest
    public void closebrowser() {
        driver.close();
        driver.quit();


    }

    public void onTestStart(ITestContext result) {

    }
}