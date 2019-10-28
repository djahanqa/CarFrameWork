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
    public void verifylogo() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.companylogo(driver);

    }

    @Test
    public void verifytools() {
        homePage = new HomePage(driver);
        homePage.tools(driver);
    }

    @Test
    public void verifyPopCpmpare() {
        homePage = new HomePage(driver);
        homePage.carComparisons(driver);

    }

    @Test
    public void verifyhondaOdysseyVSToyotaSienna(){
        homePage=new HomePage(driver);
        homePage.hondaOdysseyVSToyotaSienna(driver,"popCompareBtn1");

    }

    @Test
    public void verifyToyotaCamryHybridvsHondaAccordHybrid(){
        homePage=new HomePage(driver);
        homePage.hondaOdysseyVSToyotaSienna(driver,"popCompareBtn2");

    }
    @Test
    public void verifyNissanFrontiervsToyotaTacoma(){
        homePage=new HomePage(driver);
        homePage.hondaOdysseyVSToyotaSienna(driver,"popCompareBtn3");

    }
    @Test
    public void verifySubaruBRZvsToyota86(){
        homePage=new HomePage(driver);
        homePage.hondaOdysseyVSToyotaSienna(driver,"popCompareBtn4");

    }

    @Test
    public void verifyGMCSierra1500vsChevroletSilverado1500(){
        homePage=new HomePage(driver);
        homePage.hondaOdysseyVSToyotaSienna(driver,"popCompareBtn5");

    }
    @Test
    public void verifyChevroletCamarovsFordMustang(){
        homePage=new HomePage(driver);
        homePage.hondaOdysseyVSToyotaSienna(driver,"popCompareBtn6");

    }
    @AfterTest
    public void closebrowser() {
        driver.close();
        driver.quit();


    }
}


