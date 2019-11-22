package homepagetest;

import base.ScriptBase;
import controller.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
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
        homePage.comparison(driver,"popCompareBtn1");

    }

    @Test
    public void verifyToyotaCamryHybridvsHondaAccordHybrid(){
        homePage=new HomePage(driver);
        homePage.comparison(driver,"popCompareBtn2");

    }
    @Test
    public void verifyNissanFrontiervsToyotaTacoma(){
        homePage=new HomePage(driver);
        homePage.comparison(driver,"popCompareBtn3");

    }
    @Test
    public void verifySubaruBRZvsToyota86(){
        homePage=new HomePage(driver);
        homePage.comparison(driver,"popCompareBtn4");

    }

    @Test
    public void verifyGMCSierra1500vsChevroletSilverado1500(){
        homePage=new HomePage(driver);
        homePage.comparison(driver,"popCompareBtn5");

    }
    @Test
    public void verifyChevroletCamarovsFordMustang(){
        homePage=new HomePage(driver);
        homePage.comparison(driver,"popCompareBtn6");

    }


    @Test
    public void verifyCalculateCarPayments()throws InterruptedException{
        homePage=new HomePage(driver);
        homePage.calcuations(driver,"Calculate Car Payments");

    }

    @Test
    public void verifyShouldIleaseorpurchase()throws InterruptedException{
        homePage=new HomePage(driver);
        homePage.calcuations(driver,"Should I lease or purchase?");

    }
    @Test
    public void verifyRebatevsFinancingCalculator()throws InterruptedException{
        homePage=new HomePage(driver);
        homePage.calcuations(driver,"Rebate vs. 0% Financing");

    }

    @Test
    public void verifyAffordabilityCalculator()throws InterruptedException{
        homePage=new HomePage(driver);
        homePage.calcuations(driver,"How much car can I afford?");

    }

    @Test
    public void verifyCarAcceleratedPayoff()throws InterruptedException{
        homePage=new HomePage(driver);
        homePage.calcuations(driver,"Car Accelerated Payoff");

    }
    @Test
    public void verifyFuelSavingsCalculator()throws InterruptedException{
        homePage=new HomePage(driver);
        homePage.calcuations(driver,"Fuel Savings Calculator");

    }

    @Test
    public void verifycarbuyingGuides() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.carBuyingGuide(driver);
    }


    @AfterTest
    public void closebrowser() {
        driver.close();
        driver.quit();


    }

    public void onTestStart(ITestContext result) {

    }
}


