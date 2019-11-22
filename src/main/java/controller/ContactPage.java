package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;



public class ContactPage extends ScriptBase {

    @FindBy(css = "#sidepanel_wrap_js > section > header > a > span > svg")
    WebElement home;
    @FindBy(css = "#js-promo-popup > div > div.temp2-col-main.company > div.col-pad > h1")
    WebElement contactUs;


    public ContactPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void facebook(WebDriver driver,String sccialMedia) throws InterruptedException {


            scroll(driver.findElement(By.cssSelector("body > div.wrapper > div.tools-bg.bleed > div.mask-lt")), driver);
            Thread.sleep(5000);

            driver.findElement(By.xpath("//div[2]//li[1]/a[@class='block']")).click();

            windowhandle(driver);
            Thread.sleep(5000);

            scroll(driver.findElement(By.cssSelector("#js-promo-popup > div > div.temp2-col-main.company > div.col-pad > h1")), driver);
            Thread.sleep(5000);

            driver.findElement(By.xpath("//a[@title='"+ sccialMedia +"']")).click();
            driver.navigate().forward();

        }

        public void scroll (WebElement element, WebDriver driver){
            driver.manage().window().maximize();

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            element.getText();
        }

        public void windowhandle (WebDriver driver){

            String windowHandleBefore = driver.getWindowHandle();

            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            String actualTitle = driver.getTitle();
            //driver.close();

            //driver.switchTo().window(windowHandleBefore);


        }

    public void onTestStart(ITestContext result) {

    }
}