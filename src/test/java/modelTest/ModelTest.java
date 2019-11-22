package modelTest;

import base.ScriptBase;
import controller.modelPage;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ModelTest extends ScriptBase {

    modelPage modelPage;

    @BeforeTest
    public void beforetest() {
        init();

    }
        @Test
        public void verifyAcura() throws InterruptedException {
            modelPage = new modelPage(driver);
            modelPage.selectblock(driver,"Acura");
        }

        @Test
        public void verifyAMGeneralo() throws InterruptedException {
            modelPage = new modelPage(driver);
            modelPage.selectblock(driver,"AM General");
        }

        @Test
    public void verifyAlfaRomeo() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Alfa Romeo");
    }
    @Test
    public void verifyAstonMartin() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Aston Martin");
    }

    @Test
    public void verifyAudi() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Audi");
    }

    @Test
    public void verifyBentley() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Bentley");
    }
    @Test
    public void verifyBMW() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"BMW");
    }

    @Test
    public void verifyBugatti() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Bugatti");
    }

    @Test
    public void verifyBuick() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Buick");
    }
    @Test
    public void verifyCadillac() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Cadillac");
    }

    @Test
    public void verifyChevrolet() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Chevrolet");
    }

    @Test
    public void verifyChrysler() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Chrysler");
    }
    @Test
    public void verifyDaewoo() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Daewoo");
    }

    @Test
    public void verifyDodge() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Dodge");
    }

    @Test
    public void verifyFerrari() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Ferrari");

    }
    @Test
    public void verifFIAT() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"FIAT");
    }

    @Test
    public void verifyFisker() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Fisker");
    }

    @Test
    public void verifyFord() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Ford");
    }
    @Test
    public void verifyFuso() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Fuso");
    }

    @Test
    public void verifyGenesis() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Genesis");
    }

    @Test
    public void verifyGMC() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "GMC");
    }
    @Test
    public void verifyHino() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Hino");
    }

    @Test
    public void verifyHonda() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Honda");
    }

    @Test
    public void verifyHUMMER() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "HUMMER");
    }
    @Test
    public void verifyHyundai() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Hyundai");
    }

    @Test
    public void verifInfiniti() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Infiniti");
    }

    @Test
    public void verifyIsuzu() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Isuzu");
    }
    @Test
    public void verifyJaguar() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Jaguar");
    }

    @Test
    public void verifyJeep() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Jeep");
    }

    @Test
    public void verifyKenworth() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Kenworth");
    }
    @Test
    public void verifyKia() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Kia");
    }

    @Test
    public void verifyLamborghini() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Lamborghini");
    }

    @Test
    public void verifyLandRover() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Land Rover");
    }
    @Test
    public void verifyLexus() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Lexus");
    }

    @Test
    public void verifyLincoln() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Lincoln");
    }

    @Test
    public void verifyLotus() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Lotus");

    }
    @Test
    public void verifMaserati() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Maserati");
    }

    @Test
    public void verifyMaybach() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Maybach");
    }

    @Test
    public void verifyMazda() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Mazda");
    }
    @Test
    public void verifyMcLaren() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"McLaren");
    }

    @Test
    public void verifyMercedesBenz() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Mercedes-Benz");
    }

    @Test
    public void verifyMercury() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Mercury");
    }

    @Test
    public void verifyMINI() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"MINI");
    }

    @Test
    public void verifyMitsubishi() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Mitsubishi");
    }

    @Test
    public void verifyNavistar() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Navistar");
    }
    @Test
    public void verifyNissan() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Nissan");
    }

    @Test
    public void verifyOldsmobile() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Oldsmobile");
    }

    @Test
    public void verifyPanoz() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Panoz");
    }
    @Test
    public void verifyPeterbilt() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Peterbilt");
    }

    @Test
    public void verifyPlymouth() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Plymouth");
    }

    @Test
    public void verifyPontiac() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Pontiac");
    }
    @Test
    public void verifyPorsche() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Porsche");
    }

    @Test
    public void verifRAM() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"RAM");
    }

    @Test
    public void verifyRollsRoyce() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Rolls-Royce");
    }
    @Test
    public void verifySaab() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Saab");
    }

    @Test
    public void verifySaleen() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Saleen");
    }

    @Test
    public void verifySaturn() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Saturn");
    }
    @Test
    public void verifyScion() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Scion");
    }

    @Test
    public void verifysmart() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"smart");
    }

    public void verifySterling() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Sterling");
    }
    @Test
    public void verifySubaru() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Subaru");
    }

    @Test
    public void verifSuzuki() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Suzuki");
    }

    @Test
    public void verifyTesla() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Tesla");
    }
    @Test
    public void verifyToyota() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Toyota");
    }

    @Test
    public void verifyVolkswagen() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver,"Volkswagen");
    }

    @Test
    public void verifyVolvo() throws InterruptedException {
        modelPage = new modelPage(driver);
        modelPage.selectblock(driver, "Volvo");
    }


    public void onTestStart(ITestContext result) {

    }
}
//    @AfterTest
//    public void closebrowser() {
//        driver.close();
//        driver.quit();
