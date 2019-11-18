package carsforsaleTest;

import base.ScriptBase;
import controller.CarsForSalePage;
import controller.TermsOfUsePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarsForSaleTest extends ScriptBase {

   CarsForSalePage carsForSalePage;

    @BeforeTest
    public void beforetest() {
        init();

    }

    @Test
    public void verifycarsale() throws InterruptedException {
        carsForSalePage = new CarsForSalePage(driver);
        carsForSalePage.carsale(driver);
    }

    @Test
    public void verifyiframe() throws InterruptedException {
        carsForSalePage = new CarsForSalePage(driver);
        carsForSalePage.iframe(driver);
    }

    @Test
    public void verifyselectMakeFromList() throws InterruptedException {
        carsForSalePage = new CarsForSalePage(driver);
        carsForSalePage.selectMakeFromList(driver,"Select Makes From List Below");
    }
    @Test
    public void verifyselectCatagory() throws InterruptedException {
        carsForSalePage = new CarsForSalePage(driver);
        carsForSalePage.selectMakeFromList(driver,"Or, Select a Category");
    }

//    @AfterTest
//    public void closebrowser() {
//        driver.close();
//        driver.quit();

    }

//}

