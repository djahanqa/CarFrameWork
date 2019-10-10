package homepagetest;

import base.ScriptBase;
import controller.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends ScriptBase {
    HomePage homePage;

    @BeforeTest
    public void beforetest() {
        init();
    }

    @Test
    public void verifylogo(){
        homePage=new HomePage(driver);
         homePage.companylogo();

    }

    @AfterTest
    public void closebrowser() {
        driver.close();
        driver.quit();


    }
}


