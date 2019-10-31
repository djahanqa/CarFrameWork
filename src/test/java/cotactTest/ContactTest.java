package cotactTest;

import base.ScriptBase;
import controller.ContactPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactTest extends ScriptBase {

   ContactPage contactPage;

   @BeforeTest
    public void beforetest() {
       init();
   }

   @Test
        public void verifyContactInfo(){
       contactPage = new ContactPage(driver);
       contactPage .contactInfo(driver);

       }
   }

