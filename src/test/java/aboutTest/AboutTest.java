package aboutTest;

import base.ScriptBase;
import controller.AboutPage;
import controller.ContactPage;
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
    public void verifyAboutInfo() {
        aboutPage = new AboutPage(driver);
        aboutPage.aboutInfo(driver);
    }

    @AfterTest
    public void closebrowser() {
        driver.close();
        driver.quit();


    }

}