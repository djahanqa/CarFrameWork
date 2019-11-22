package termsOfUseTest;

import base.ScriptBase;
import controller.TermsOfUsePage;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TermsOfUseTest extends ScriptBase {
    TermsOfUsePage termsOfUse;

    @BeforeTest
    public void beforetest() {
        init();

    }

    @Test
    public void verifytermsOfUse() {
        termsOfUse = new TermsOfUsePage(driver);
        termsOfUse.termsOfUse(driver);
    }

    @AfterTest
public void closebrowser() {
        driver.close();
        driver.quit();

        }

    public void onTestStart(ITestContext result) {

    }
}