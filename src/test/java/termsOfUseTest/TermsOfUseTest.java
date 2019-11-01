package termsOfUseTest;

import base.ScriptBase;
import controller.ContactPage;
import controller.TermsOfUse;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TermsOfUseTest extends ScriptBase {
    TermsOfUse termsOfUse;

    @BeforeTest
    public void beforetest() {
        init();

    }

    @Test
    public void verifytermsOfUse() {
        termsOfUse = new TermsOfUse(driver);
        termsOfUse.termsOfUse(driver);
    }

    @AfterTest
public void closebrowser() {
        driver.close();
        driver.quit();

        }

        }