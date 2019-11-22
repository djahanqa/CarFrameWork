package privacyPolicieTest;

import base.ScriptBase;
import controller.ContactPage;
import controller.PrivacyPolicyPage;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrivacyPolicyTest extends ScriptBase {

    PrivacyPolicyPage privacyPolicyPage;

    @BeforeTest
    public void beforetest() {
        init();
    }

    @Test
    public void verifyprivacyPolicy() {
        privacyPolicyPage = new PrivacyPolicyPage(driver);
        privacyPolicyPage.privacyPolicy(driver);
    }


    @AfterTest
    public void closebrowser() {
        driver.close();
        driver.quit();

}

    public void onTestStart(ITestContext result) {

    }
}