package carTest;

import base.ScriptBase;
import controller.CarPage;
import controller.CarsForSalePage;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CarTest extends ScriptBase {
    CarPage carPage;

    @BeforeTest
    public void beforetest() {
        init();
    }

    @Test
    public void verifycarsale() throws InterruptedException {
        carPage = new CarPage(driver);
        carPage.carCatagory(driver,"coupe");
    }

    public void onTestStart(ITestContext result) {

    }
}