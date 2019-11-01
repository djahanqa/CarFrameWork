package researchPageTest;

import base.ScriptBase;
import controller.ResearchPage;
import controller.TermsOfUse;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ResearchPageTest extends ScriptBase {

    ResearchPage researchPage;
    @BeforeTest
    public void beforetest() {
        init();

    }
        @Test
        public void verifyResearchPage() throws InterruptedException {
            researchPage = new ResearchPage(driver);
            researchPage.research(driver);
        }

        @AfterTest
        public void closebrowser() {
            driver.close();
            driver.quit();

        }

    }


