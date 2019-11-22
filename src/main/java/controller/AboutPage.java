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


public class AboutPage extends ScriptBase {

    @FindBy (css = "#js-promo-popup > div > div.temp2-col-main.company > div.col-pad > h1")
    WebElement autoweb;


    public AboutPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void aboutInfo(WebDriver driver,String about) throws InterruptedException {

            scroll(driver.findElement(By.cssSelector("body > div.wrapper > div.tools-bg.bleed > div.mask-lt")), driver);
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("body > div.wrapper > footer > div > ul > li:nth-child(2) > a")).click();
            windowhandle(driver);
        Assert.assertEquals(autoweb,autoweb);
    }


        public void scroll(WebElement element,WebDriver driver) {
            driver.manage().window().maximize();

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            element.getText();
        }

        public void windowhandle(WebDriver driver){

            String windowHandleBefore = driver.getWindowHandle();

            for (String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
            }
            String actualTitle = driver.getTitle();

    }

    public void onTestStart(ITestContext result) {

    }
}